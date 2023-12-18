import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;

		while ((n = scan.nextInt()) != 0) {

			int m = scan.nextInt();

			short[][] cost = new short[100][100];
			short[][] time = new short[100][100];

			init(cost);
			init(time);

			for (int i = 0; i < n; i++) {
				int a = scan.nextInt()-1;
				int b = scan.nextInt()-1;
				cost[a][b] = cost[b][a] = scan.nextShort();
				time[a][b] = time[b][a] = scan.nextShort();
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					for (int j2 = 0; j2 < m; j2++) {
						cost[j][j2] = (short) Math.min(cost[j][j2], cost[j][i]
								+ cost[i][j2]);
						time[j][j2] = (short) Math.min(time[j][j2], time[j][i]
								+ time[i][j2]);
					}
				}
			}

			int k = scan.nextInt();

			for (int i = 0; i < k; i++) {
				int p = scan.nextInt()-1;
				int q = scan.nextInt()-1;
				int r = scan.nextInt();
				System.out.println(r==0 ? cost[p][q] : time[p][q]);
			}

		}

	}

	public static void init(short[][] a){
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				a[i][j] = Short.MAX_VALUE/2;
			}
		}
		for (int i = 0; i < 100; i++) {
			a[i][i]=0;
		}
	}
}