import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    sc.nextLine();
	    long returnscore = 0;
	    int[] p = new int[n];
	    long[] c = new long[n];
	    for (int i = 0; i < n; i++) {
	    	p[i] = sc.nextInt();
	    }
	    sc.nextLine();
	    for (int i = 0; i < n; i++) {
	    	c[i] = sc.nextInt();
	    }
	    for (int i = 0; i < n; i++) {
	    	int nextp = p[i];
	    	long score = 0;
	    	for (int j = 0; j < k; j++) {
		    	nextp = p[nextp - 1];
	    		score = score + c[nextp - 1];
	    		if (j == 0 && i == 0) returnscore = score;
	    		if (returnscore <= score) returnscore = score;
	    	}
	    }
	    System.out.println(returnscore);
	}
}
