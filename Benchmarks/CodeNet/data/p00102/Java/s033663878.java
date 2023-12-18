
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[][] num = new int[n + 1][n + 1];
			for (int i = 0; i < n + 1; i++) {
				for (int j = 0; j < n + 1; j++) {
					if (i != n && j != n) {
						int a = scanner.nextInt();
						num[i][j] = a;
						num[i][n] += a;
						num[n][j] += a;
					} else if (i == n && j != n) {
						num[n][n] += num[n][j];
					}
					System.out.print(String.format("%5d", num[i][j]));
				}
				System.out.println();
			}
		}

	}
}