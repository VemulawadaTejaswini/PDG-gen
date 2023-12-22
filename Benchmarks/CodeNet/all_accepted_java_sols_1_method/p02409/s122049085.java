import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	private static final String DORM_SEPARATOR = "####################";
	private static int DORM_COUNT = 4;
	private static int FLOOR_COUNT = 3;
	private static int ROOM_COUNT = 10;

	public static void main(String[] args) {

		int n;
		int b, f, r, v;

		List<int[][]> house = new ArrayList<>();
		for (int i = 1; i <= DORM_COUNT; i++) {
			house.add(new int[FLOOR_COUNT][ROOM_COUNT]);
		}

		Scanner stdIn = new Scanner(System.in);

		n = stdIn.nextInt();

		for (int i = 0; i < n; i++) {
			b = stdIn.nextInt();
			f = stdIn.nextInt();
			r = stdIn.nextInt();
			v = stdIn.nextInt();

			house.get(b-1)[f-1][r-1] += v;

		}

		int count = 0;
		for(int[][] floor : house) {
			for(int i = 0; i < FLOOR_COUNT; i++) {
				for(int j = 0; j < ROOM_COUNT; j++) {
					System.out.print(" " + floor[i][j]);
				}
				System.out.println();
			}
			count++;
			if(count == 4) {
				break;
			}
			System.out.println(DORM_SEPARATOR);
		}
	}

}