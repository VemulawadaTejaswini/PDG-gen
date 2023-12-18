import java.util.*;
class Main{
    public static void main(String[] args){
    	//final int MAX =200000;
    	
    
    	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
    	int[] R=new int[n];
    	
    	for(int i=0;i<n;i++){
    		 R[i]=Integer.parseInt(sc.next());
    	}
    	long maxv=-2000000000;
    			 
    	long minv=R[0];
    	for(int i=1;i<n;i++){
    		maxv=Math.max(maxv,R[i]-minv);
    		minv=Math.min(minv,R[i]);
    	}
    	System.out.println(maxv);
    	
    }
}