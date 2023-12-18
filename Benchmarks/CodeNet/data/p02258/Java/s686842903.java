import java.util.*;
class Main{
    public static void main(String[] args){
    	//final int MAX =200000;
    	
    	int n;
    	Scanner sc = new Scanner(System.in);
    	n=sc.nextInt();
    	long[] R=new long[n];
    	Scanner sc1 = new Scanner(System.in);
    	for(int i=0;i<n;i++){
    		 R[i]=sc1.nextLong();
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