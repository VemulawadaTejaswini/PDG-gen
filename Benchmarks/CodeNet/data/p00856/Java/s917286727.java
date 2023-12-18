public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			int l = sc.nextInt();
			int b = sc.nextInt();
			if (n == 0 && t == 0 && l == 0 && b == 0)
				break;
			double[][] field = new double[t + 1][n + 1];
			field[0][0] = 1;
			int[] lose = new int[l];
			int[] back = new int[b];
			for (int i = 0; i < l; i++)
				lose[i] = sc.nextInt();
			for (int i = 0; i < b; i++)
				back[i] = sc.nextInt();
			for (int i = 0; i < t; i++) {
				field[i + 1][n] += field[i][n];
				for (int j = 0; j < n; j++) {
					if (!contains(lose, j))
						for (int k = 1; k <= 6; k++) {
							if (j + k < n + 1)
								field[i + 1][j + k] += field[i][j] / 6;
							else
								field[i + 1][n - (j + k - n)] += field[i][j] / 6;
						}
					else if (i < t - 1) {
						for (int k = 1; k <= 6; k++) {
							if (j + k < n + 1)
								field[i + 2][j + k] += field[i][j] / 6;
							else
								field[i + 2][n - (j + k - n)] += field[i][j] / 6;
						}
					}
				}
				for (int j = 0; j < b; j++) {
					field[i + 1][0] += field[i + 1][back[j]];
					field[i + 1][back[j]] = 0;
				}
			}
			System.out.printf("%.6f", field[t][n]);
		}
		sc.close();
	}

	static boolean contains(int[] lose, int id) {
		for (int i = 0; i < lose.length; i++)
			if (lose[i] == id)
				return true;
		return false;
	}
}