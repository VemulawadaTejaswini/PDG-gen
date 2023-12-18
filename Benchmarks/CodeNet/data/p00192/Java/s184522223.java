import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static final int MAX_SIZE = 10;
	public static final int MAX_CAR = 100;

	public static final int M_INF = Integer.MIN_VALUE / 2 + 1;

	public static boolean try_fst(int[][] spaces, int[][] numbers, final int m,
			final int remain_time, final int car_number) {
		for (int i = 0; i < m; i++) {
			if (spaces[i][0] <= M_INF) {
				spaces[i][0] = remain_time;
				numbers[i][0] = car_number;
				return true;
			}
		}

		return false;
	}

	public static void add_time(int[][] spaces, final int m, final int time) {
		for (int i = 0; i < m; i++) {
			if (spaces[i][0] <= M_INF) {
				continue;
			}

			spaces[i][0] -= time;
			spaces[i][1] -= time;
		}
	}

	public static boolean is_finish(int[][] spaces, final int m) {
		for (int i = 0; i < m; i++) {
			if (spaces[i][0] > M_INF) {
				return false;
			}
		}

		return true;
	}

	public static boolean can_upper(int[][] spaces, int[][] numbers,
			final int m, final int remain_time, final int car_number) {
		for (int i = 0; i < m; i++) {
			if (spaces[i][0] >= remain_time && spaces[i][1] <= M_INF) {
				return true;
			}
		}

		return false;
	}

	public static boolean try_snd(int[][] spaces, int[][] numbers, final int m,
			final int remain_time, final int car_number) {
		final boolean can_upper = can_upper(spaces, numbers, m, remain_time,
				car_number);

		int pos = -1;
		int attr = can_upper ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		for (int i = 0; i < m; i++) {
			// System.out.println(can_upper + " " + (spaces[i][0]<= M_INF) + " "
			// + (attr < spaces[i][0]));

			if (can_upper && spaces[i][1] <= M_INF
					&& spaces[i][0] >= remain_time && attr > spaces[i][0]) {
				attr = spaces[i][0];
				pos = i;
			} else if (!can_upper && spaces[i][1] <= M_INF
					&& attr < spaces[i][0]) {
				attr = spaces[i][0];
				pos = i;
			}
		}

		// System.out.println(attr + " " + pos + " " + can_upper);

		if (pos < 0) {
			return false;
		}

		spaces[pos][1] = Math.max(spaces[pos][0], remain_time);
		numbers[pos][1] = numbers[pos][0];
		spaces[pos][0] = remain_time;
		numbers[pos][0] = car_number;

		return true;
	}

	public static void print(int[][] spaces, int[][] numbers, final int m) {
		System.out.println("-----------------------------------");
		for (int i = 0; i < m; i++) {
			System.out.print(spaces[i][0] + " ");
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print(spaces[i][1] + " ");
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print(numbers[i][0] + " ");
		}
		System.out.println();
		for (int i = 0; i < m; i++) {
			System.out.print(numbers[i][1] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] spaces = new int[MAX_SIZE][2];
		int[][] numbers = new int[MAX_SIZE][2];

		while (true) {
			final int m = sc.nextInt();
			final int n = sc.nextInt();

			if (m == 0 && n == 0) {
				break;
			}

			for (int i = 0; i < m; i++) {
				spaces[i][0] = spaces[i][1] = M_INF;
				numbers[i][0] = numbers[i][1] = -1;
			}

			LinkedList<Integer> remain_queue = new LinkedList<Integer>();
			LinkedList<Integer> number_queue = new LinkedList<Integer>();
			// int time = 0;

			LinkedList<Integer> out_numbers = new LinkedList<Integer>();
			for (int car = 0;; car++) {
				//
				if (car < n) {
					remain_queue.add(sc.nextInt());
					number_queue.add(car + 1);
				} else if (remain_queue.isEmpty() && is_finish(spaces, m)) {
					break;
				}

				for (int t = 0; t < 10; t++) {
					add_time(spaces, m, 1);
					// print(spaces, numbers, m);

					while (true) {
						int min = 1;
						int min_pos = -1;
						int min_car = -1;

						for (int i = 0; i < m; i++) {
							if (spaces[i][0] <= M_INF) {
								continue;
							} else if (spaces[i][0] < min) {
								min = spaces[i][0];
								min_car = numbers[i][0];
								min_pos = i;
							}
						}

						if (min_car == -1) {
							break;
						}

						spaces[min_pos][0] = spaces[min_pos][1];
						numbers[min_pos][0] = numbers[min_pos][1];
						spaces[min_pos][1] = M_INF;
						numbers[min_pos][1] = M_INF;
						out_numbers.add(min_car);
					}
				}

				while (!remain_queue.isEmpty()) {
					final int remain_time = remain_queue.poll();
					final int car_number = number_queue.poll();

					if (try_fst(spaces, numbers, m, remain_time, car_number)) {
						// ok
						continue;
					} else if (try_snd(spaces, numbers, m, remain_time,
							car_number)) {
						// ok
						continue;
					} else {
						// System.out.println("fail " + car_number);
						remain_queue.addFirst(remain_time);
						number_queue.addFirst(car_number);
						break;
					}
				}
			}

			boolean first = true;
			for (int i : out_numbers) {
				if (first) {
					first = false;
					System.out.print(i);
				} else {
					System.out.print(" " + i);
				}
			}
			System.out.println();

			// System.out.println(out_numbers);
		}

	}

}