import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int cur = 0;
    	long sum = 0;
    	for (int i = 0; i < n; i++) {
    	    int x = sc.nextInt();
    	    if (cur <= x) {
    	        cur = x;
    	    } else {
    	        sum += cur - x;
    	    }
    	}
    	System.out.println(sum);
    }
}

