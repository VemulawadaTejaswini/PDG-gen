
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int n, m, l, i, j, k, A[][], B[][];
    	long C[][];
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
    	l = sc.nextInt();
    	
    	A = new int[n][m];
    	B = new int[m][l];
    	C = new long[n][l];
    	
    	for(i = 0; i < n; i++) {
    		for(j = 0; j < m; j++) {
    			A[i][j] = sc.nextInt();
    		}
    	}
    	for(i = 0; i < m; i++) {
    		for(j = 0; j < l; j++) {
    			B[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(i = 0; i < n; i++) {
    		for(j = 0; j < l; j++) {
    			for(k = 0; k < m; k++) {
    				C[i][j] += A[i][k] * B[k][j];
    			}
    			System.out.print(C[i][j]);
    			if(j != l - 1) System.out.print(" ");
    		}
    		System.out.println();
    	}
    }
}
