import java.util.*;

public class Main { 
    public static int compute_maxprofit(int n, int[] R){
      int max_profit = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int temp;
      for(int i = 0; i < n; i++) {
    	  temp = R[i];
    	  max_profit = Math.max(max_profit, temp - min);
    	  min = Math.min(temp,  min); 
      }
      return max_profit;
    }
 public static void main(String[] args) { 
	 Scanner in = new Scanner(System.in);
	 int lines = in.nextInt();
	 int[] values = new int[lines];
	 for(int i = 0; i < lines; i++){
	     values[i] = in.nextInt();
	 }
	 System.out.println(compute_maxprofit(lines, values));
	 in.close();
 }
}
