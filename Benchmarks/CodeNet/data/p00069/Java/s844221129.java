import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int start, end;
		int barData[][];
		int way[];
		int bestWay[];

		barData= new int[30][10];
		way = new int[30];
		bestWay = new int[30];
		n = sc.nextInt();
		while (n != 0) {
			start = sc.nextInt();
			end = sc.nextInt();
			k = sc.nextInt();

			for (int i = 0; i < k; i++) {
				String s = sc.next();
				for (int j = 0; j < n - 1; j++) {
					barData[i][j] = s.charAt(j) - '0';
				}
			}

			way[0] = start;
			for (int i = 0; i < k; i++) {
				way[i + 1] = makeNextWay(way[i], barData[i]);
			}
			bestWay[k] = end;
			for (int i = k - 1; 0 <= i; i--) {
				bestWay[i] = makeNextWay(bestWay[i + 1], barData[i]);
			}
			
			if (way[0] == bestWay[0]) {
				System.out.println("0");
				n = sc.nextInt();
				continue;
			}

			boolean flag = true;
			for (int i = 0; i < k; i++) {
				if (Math.abs(way[i] - bestWay[i]) == 1) {
					int min = Math.min(way[i], bestWay[i]);
					if (min == 1) {
						if (barData[i][min - 1] == 0 && barData[i][min] == 0) {
							System.out.println((i + 1) + " " + min);
							flag = false;
							break;
						}
					} else if (min == n - 1) {
						if (barData[i][min - 2] == 0 && barData[i][min - 1] == 0) {
							System.out.println((i + 1) + " " + min);
							flag = false;
							break;
						}
					} else {
						if (barData[i][min - 2] == 0 && barData[i][min - 1] == 0 && barData[i][min] == 0) {
							System.out.println((i + 1) + " " + min);
							flag = false;
							break;
						}
					}
				}
			}
			if (flag) {
				System.out.println("1");
			}

			n = sc.nextInt();
		}
	}

	public static int makeNextWay(int pre, int barData[]) {
		int n = barData.length + 1;

		if (pre == 1) {
			if (barData[0] == 1) {
				return pre + 1;
			} else {
				return pre;
			}
		} else if (pre == n) {
			if (barData[n - 2] == 1) {
				return pre - 1;
			} else {
				return pre;
			}
		} else {
			if (barData[pre - 2] == 1) {
				return pre - 1;
			} else if (barData[pre - 1] == 1) {
				return pre + 1;
			} else {
				return pre;
			}
		}
	}
}