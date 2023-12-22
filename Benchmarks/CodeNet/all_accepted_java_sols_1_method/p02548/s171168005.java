import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();

	    int count = 0;
	    for (int a = n; a > 0; a--) {
	    	int b_max = (int)Math.floor((double)n / (double)a);
	    	if (b_max > n) {
	    		b_max = n;
	    	}
	    	if (b_max > a) {
	    		b_max = a;
	    	}
	    	for (int b = b_max; b <= a && b > 0; b--) {
    			int c = n - a * b;
	    		if (c <= n && c > 0) {
	    			count++;
	    			if (a != b) {
	    				count++;
	    			}
	    		}
	    	}
	    }
	    System.out.println(count++);
	}

}