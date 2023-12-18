import java.util.Scanner;

public class Main{
	

	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] R = new int [n];
	    
	    for(int i = 0; i < n; i++) {
	    	R[i] = sc.nextInt();
	       
	    }//for
	    System.out.println(compute_maxprofit(n,R));
	    
	}//main
	
	 public static int compute_maxprofit(int n, int[] R) {
	     int max_profit = -999999999;
	     int m = R[0];
	      for(int i = 1; i < n ; i ++) {
	    	  if(R[i] - m > max_profit) {
	    		 max_profit = R[i] - m;
	    		  
	    	  }//if
	    	  if(R[i] < m) {
	    		  m = R[i];
	    	  }//if
		 
		  
	      }//for
	      return max_profit;
	 }
}
