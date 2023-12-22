import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		long x=scn.nextLong();
		long  k =scn.nextLong();
	     long d =scn.nextLong();
	     x =Math.abs(x);
	     long val1= x/d;
//	     if(x%d!=0){
//	    	 val1++;
//	     }
	    
	     long val2= x-d*val1;
	     if(val1>k){
	    	  long ans = x-d*k;
	    	 System.out.println(ans);
	     }else{
	    	   k-=val1;
	    	   long val3=Math.abs(val2-d);
	    	   if(k%2==0){
	    		   System.out.println(val2);
	    	   }else{
	    		   System.out.println(val3);
	    	   }
	    	 
//	    	  long ans = Math.min(val2, val3);
//	    	  System.out.println(ans);
	     }
	     

	}

}