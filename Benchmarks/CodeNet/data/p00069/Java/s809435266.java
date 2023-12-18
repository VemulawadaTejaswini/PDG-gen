import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int start, end;
		int barData[][];
		int way[];
		int bestWay[];

		barData= new int[100][100];
		way = new int[100];
		bestWay = new int[100];
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
					boolean flag2 = true;
					if (2 <= min && barData[i][min - 2] == 1) {
						flag2 = false;
					}
					if (min <= n - 1 && barData[i][min - 1] == 1) {
						flag2 = false;
					}
					if (min <= n - 2 && barData[i][min] == 1) {
						flag2 = false;
					}
					if (flag2) {
						System.out.println((i + 1) + " " + min);
						flag = false;
						break;
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

		if (0 <= pre - 2 && pre - 2 <= n - 2 && barData[pre - 2] == 1) {
			return pre - 1;
		} else if (0 <= pre - 1 && pre - 1 <= n - 2 && barData[pre - 1] == 1) {
			return pre + 1;
		} else {
			return pre;
		}
	}
}