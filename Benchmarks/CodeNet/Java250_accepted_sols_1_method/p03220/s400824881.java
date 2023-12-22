import java.util.*;
class Main{
	
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	  int t=sc.nextInt();
    	  int a=sc.nextInt();
    	  int h[]=new int[n];
    	  int ans=0;
    	  double b[]=new double[n];
    	  for (int i=0;i<n;i++){
    	   h[i]=sc.nextInt(); 
    	   b[i]=Math.abs(t-h[i]*0.006-a);
    	   	   if(b[i]<b[ans]) {
    	   		   ans=i;
    	   	   }	
    	  }
         System.out.println(ans+1); 
    }
}