import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int pMax = 0;
    	int pMin = Integer.MAX_VALUE;
    	int mMax = Integer.MIN_VALUE;
    	int mMin = Integer.MAX_VALUE;
    	for (int i = 0; i < n; i++) {
    	    int x = sc.nextInt();
    	    int y = sc.nextInt();
    	    pMax = Math.max(pMax, x + y);
    	    pMin = Math.min(pMin, x + y);
    	    mMax = Math.max(mMax, x - y);
    	    mMin = Math.min(mMin, x - y);
    	}
	    System.out.println(Math.max(pMax - pMin, mMax - mMin));
	}
}