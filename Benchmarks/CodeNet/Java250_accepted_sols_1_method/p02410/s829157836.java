import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[][][] houses = new int[4][3][10];	
	int n = scan.nextInt();
	int m = scan.nextInt();
	int[][] a = new int[n][m];
	int[] b = new int[m];
	int[] c = new int[n];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		int element = scan.nextInt();
		a[i][j] = element;
	    }
	}
	for (int i = 0; i < m; i++) {
	    int element = scan.nextInt();
	    b[i] = element;
	}
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		c[i] += a[i][j] * b[j];
	    }
	    System.out.println(c[i]);
	}
    }
}