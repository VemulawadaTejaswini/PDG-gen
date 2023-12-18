import java.util.Arrays;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n, m, i, j;
    	
    	n = sc.nextInt();
    	m = sc.nextInt();
        
    	int[][] a = new int[n][m];
    	int[] b = new int[m];
    	int[] c = new int[n];
    	Arrays.fill(c, 0);
        
    	for(i = 0; i < n; i++) {
    		for(j = 0; j < m; j++) {
    			a[i][j] = sc.nextInt();
    		}
    	}
    	
    	for(i = 0; i < m; i++) {
    		b[i] = sc.nextInt();
    	}
    	
    	
    	for(i = 0; i < n; i++) {
    		for(j = 0; j < m; j++) {
    			c[i] += a[i][j] * b[j];
    		}
    		System.out.println(c[i]);
    	}
    	
    	
    }
}
