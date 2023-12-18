
import java.util.*;

public class Main {
	
	//given n times, and R, an array of currencies/rates
	  public static int compute_maxprofit(int n, Integer[] R) {
	      int max_profit = -100000;
	      for(int i = 0; i < n - 1; i ++) {
	    	  for(int j = i + 1; j < n; j ++){
	    		  if(R[j] - R[i] > max_profit) {
	    			  max_profit = R[j] - R[i];
	    		  }	  
	    	  }
	      }
	      return max_profit;
	  }
	  
	  public static int fastCompute_Maxprofit(int n, Integer[] R) {
		  int max_profit = Integer.MIN_VALUE;
		  int min_prior=Integer.MAX_VALUE;
		  
		  for(int i=0; i<n; i++) {
			  int c=R[i];
			  
			  if((c-min_prior)>max_profit) {
				  max_profit=c-min_prior;
			  }
			  if(c<min_prior) {
				  min_prior=c;
			  }
		  }
		  
		  return max_profit;
	  }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int duration = sc.nextInt();
		
		Integer[] R = new Integer[duration];
		
		for(int i = 0; i<duration; i++) {
			R[i]=sc.nextInt();
		}
		
		System.out.println(fastCompute_Maxprofit(duration,R));
		
	}

}
