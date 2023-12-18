import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] R = new int[n]; 
		for(int k=0; k<n; k++) {
			R[k] = scan.nextInt();
		}
		System.out.println(compute_maxprofit(n, R));
	}
	    public static int compute_maxprofit(int n, int[] R) {
	    	int max_profit = Integer.MIN_VALUE;
	    	int j = R[0];
	    	for(int i = 1; i<n; i++) {
	    		int current_profit = R[i] - j;
	    		if (max_profit < current_profit) {
	    			max_profit = current_profit;
	    		}
	    		if (R[i] < j) {
	    			j = R[i];
	    		}
	    	}
	    	return max_profit;
	    	
	    	
	    }    
}

