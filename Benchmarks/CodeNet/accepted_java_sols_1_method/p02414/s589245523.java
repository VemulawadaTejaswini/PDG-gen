import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while (scan.hasNext()) {
	    int n = scan.nextInt();
	    int m = scan.nextInt();
	    int l = scan.nextInt();
	    int[][] a = new int[n][m];
	    int[][] b = new int[m][l];
	    long[][] c = new long[n][l];
	    for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
		    a[i][j] = scan.nextInt();
		}
	    }
	    for (int i = 0; i < m; i++) {
		for (int j = 0; j < l; j++) {
		    b[i][j] = scan.nextInt();
		}
	    }
	    for (int i = 0; i < n; i++) {
		for (int j = 0; j < l; j++) {
		    for (int k = 0; k < m; k++) {
			c[i][j] += (long)(a[i][k] * b[k][j]);
		    }
		}
	    }
	    for (int i = 0; i < n; i++) {
		System.out.print(c[i][0]);
		for (int j = 1; j < l; j++) {
		    System.out.print(" " + c[i][j]);
		}
		System.out.println();
	    }
	}
    }
}