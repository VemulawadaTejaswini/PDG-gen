import java.io.*;
import java.util.*;
class Main {

	
	int lcs(char[] X, char[] Y, int m, int n) 
    { 
        int table[][] = new int[m + 1][n + 1]; 
  
        for (int i = 1; i <= m; i++) { 
            for (int j = 1; j <= n; j++) { 
                if (X[i - 1] != Y[j - 1]) {
                	table[i][j] = max(table[i - 1][j], table[i][j - 1]);}
                else {
                     table[i][j] = 1 + table[i - 1][j - 1];}
            } 
        } 
        return table[m][n]; 
    } 
	
	int max(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Main test1 = new Main();
	    Scanner in = new Scanner(System.in);
	    int total = in.nextInt();
	    
	    for(int i = 0; i < total; i++) {
	    	String a1 = in.next();
	    	String a2 = in.next();
	    	char[] a=a1.toCharArray(); 
	    	char[] b=a2.toCharArray(); 
	    	int m = a.length; 
	    	int n = b.length;
	    	System.out.println(test1.lcs( a, b, m, n ) );}
	    
	    
	}
}

