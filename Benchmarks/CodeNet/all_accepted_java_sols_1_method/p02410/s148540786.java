import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int a[][] = new int[n][m];
	    int b[] = new int[m];
	    
	    for (int i = 0; i < n; i++){
	    	for (int j = 0; j < m; j++){
	    		a[i][j] = sc.nextInt();
	    	}
	    }
	    
	    for (int i = 0; i < m; i++){
	    	b[i] = sc.nextInt();
	    }
	    
	    for (int i = 0; i < n; i++){
		    int total = 0;
	    	for (int j = 0; j < m; j++){
	    		total += a[i][j] * b[j];
	    	}
	    	System.out.println(total);
	    }
	}
}