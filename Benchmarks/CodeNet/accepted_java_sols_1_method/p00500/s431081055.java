public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[][] tmp = new int[n][3];
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++) {
				tmp[i][j] = in.nextInt();
			}
		}
		for (int i=0; i<3; i++) {
			for (int j=n-1; j>=0; j--) {
				int lanp = 0;
				for (int k=0; k<j; k++) {
					if (tmp[j][i] == tmp[k][i]) {
						tmp[k][i] = 0;
						lanp = 1;
					}
				}
				if (lanp == 1)
					tmp[j][i] = 0;
			}
		}
		for (int i=0; i<n; i++) {
			int sum = 0;
			for (int j=0; j<3; j++)
				sum += tmp[i][j];
			System.out.println(sum);
		}
	}
}