
import java.lang.reflect.Array;
import java.util.*;

public class Main {

	 private static int[] rs;

		public static int compute_maxprofit(int[] R) {
		      int max_profit = Integer.MIN_VALUE;
		      int smallest = R[0];
		      for(int i=1; i<R.length; i++) {
		      if(max_profit < R[i] - smallest) {
		    	  max_profit = R[i] - smallest;
		      }
		      smallest = Math.min(R[i], smallest);
		      }
		      return max_profit;
		}
		  
		  public static void main(String[] args) {
			  Scanner input = new Scanner(System.in);
			  int n = input.nextInt();
			  rs = new int[n];
			  for(int i=0; i<n; i++) {
				  rs[i] = input.nextInt();
		      }
			  System.out.println(compute_maxprofit(rs));
		  }
}

