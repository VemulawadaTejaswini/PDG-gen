import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int n, m, l;
        long sum;
        int[][] a;
        int[][] b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        l = sc.nextInt();
        a = new int[n][m];
        b = new int[m][l];
        for (int i = 0; i < n; i++) 
        	for (int j = 0; j < m; j++) 
        		a[i][j] = sc.nextInt();
        for (int i = 0; i < m; i++)
        	for (int j = 0; j < l; j++)
	        	b[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
        	for (int k = 0; k < l; k++) {
        		sum = 0;
	        	for (int j = 0; j < m; j++) {
    	    		sum += a[i][j] * b[j][k];
        		}
        		System.out.print(sum);
        		if (k != l - 1) 
        			System.out.print(" ");
        	}
        	System.out.println();
        }
    }
}
