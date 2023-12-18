import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int k = in.nextInt();
	     int[] arr = new int[n+1];
	     int[] cost = new int[n+1];
	     for(int i =1; i<= n; i++)
	    	 arr[i] = in.nextInt();
	     
	     for(int i =1; i<= n ; i++) {
	    	 cost[i] = in.nextInt();
	     }
	     
	     boolean[] used = new boolean[n+1];
	     long re= Integer.MIN_VALUE;
	     long  cur =0;
	     int idx =0;
	     
	     for(int i =1; i<=n; i++)  {
	    	 idx = arr[i];
	    	 cur = cost[idx];
	    	 re= Math.max(re, cur);
	    	 
	    	 used[i]=true;
	    	 
	    	 int count =1;
	    	 while(true) {
	    		 if(used[idx] || count>=k) break;
	    		 
	    		 used[idx]=true;
	    	     count++;
	    	     idx = arr[idx];
	    	     cur+= cost[idx];
	    	     re= Math.max(re, cur);
	    	 }
	    	 
	    	 used = new boolean[n+1];
	    	 if(cur>0 && k>=count) {
	    		 cur = cur * (k/count-1);
	    		 int idx2 = arr[i];
	    		 for(int j =0; j< count +(k%count); j++) { // residuo
	    			 cur += cost[idx2];
	    			 idx2= arr[idx2];
	    			 re= Math.max(re, cur);
	    		 }
	    	 }
	     }
	     
         System.out.println(re);
	}	

}