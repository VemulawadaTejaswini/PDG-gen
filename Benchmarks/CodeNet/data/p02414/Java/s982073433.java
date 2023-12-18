import java.util.Scanner;

//20180510
//02

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[m][l];
		int[][] c = new int[n][l];

		for(int x = 0;x < n;x++) {
			for (int y = 0; y < m; y++) {
				a[x][y] = scanner.nextInt();
			}
		}

		for(int x = 0;x < m;x++) {
			for (int y = 0; y < l; y++) {
				b[x][y] = scanner.nextInt();
			}
		}

		for(int x = 0;x < n;x++) {
			for (int y = 0; y < l; y++) {
				for (int z = 0; z < m; z++) {
					c[x][y] += a[x][z] * b[z][y];
				}
			}
		}

		for(int x = 0;x < l;x++) {
			for (int y = 0; y < m; y++) {
					System.out.printf("%d ",c[x][y]);
			}
			System.out.println(c[x][m]);
		}

		scanner.close();
    }
}
