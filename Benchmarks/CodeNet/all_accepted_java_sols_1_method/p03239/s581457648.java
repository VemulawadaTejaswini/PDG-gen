import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int N = sc.nextInt();
		    int T = sc.nextInt();
		    int[] c = new int[N];
		    int[] t = new int[N];
		    int mincost = 10000;
		    
		    for(int i = 0; i < N; i++) {
		    	c[i] = sc.nextInt();
		    	t[i] = sc.nextInt();
		    	if(t[i] > T) {
		    		continue;
		    	}
		    	else {
		    		if(c[i] < mincost) {
		    			mincost = c[i];
		    		}
		    	}
		    }
		    if(mincost > 1000) {
		    	System.out.println("TLE");
		    }
		    else {
		    	System.out.println(mincost);
		    }
		    
		    sc.close(); }
}
