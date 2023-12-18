import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int minMap[][];
		int kTown;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			minMap = new int[10][10];
			kTown = 0;
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (i == j) {
						minMap[i][j] = 0;
					} else {
						minMap[i][j] = 1000;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				int cost = sc.nextInt();
				minMap[v1][v2] = cost;
				minMap[v2][v1] = cost;
				if (kTown < Math.max(v1,  v2)) {
					kTown = Math.max(v1,  v2);
				}
			}

			for (int k = 0; k <= kTown; k++) {
				for (int i = 0; i <= kTown; i++) {
					for (int j = 0; j <= kTown; j++) {
						minMap[i][j] = Math.min(minMap[i][j], minMap[i][k] + minMap[k][j]);
					}
				}
			}

			int min, minIndex;
			min = Integer.MAX_VALUE;
			minIndex = 0;
			for (int i = 0; i <= kTown; i++) {
				int sum = 0;
				for (int j = 0; j <= kTown; j++) {
					sum += minMap[i][j];
				}
				if (sum < min) {
					min = sum;
					minIndex = i;
				}
			}
			System.out.println(minIndex + " " + min);
		}
	}
}