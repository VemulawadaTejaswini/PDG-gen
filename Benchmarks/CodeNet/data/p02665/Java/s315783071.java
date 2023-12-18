import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		
		String[] values = input.nextLine().split(" ");
	    int[] val = new int[values.length];
	    
	    for(int v=0; v< values.length; v++) {
	    	val[v] = Integer.parseInt(values[v]);
	    }
	    
	    int count =1;
	    int leaves = 1;
	    int maxleaves = 0;
	    int usedLeaves = leaves;
	   if(leaves <2) 
	    for (int i=0; i<n+1; i++) {
	    
	    	 maxleaves= 2*usedLeaves;
	    	 if(val[i] <= maxleaves) {
	    		 usedLeaves = maxleaves - (val[i]*2);
		    	 count = count + usedLeaves;
	    	 } else {
	    		 count =-1;
	    		 break;
	    	 }
	    }
	   
	   System.out.println(count);
	  
	}
}
