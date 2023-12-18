import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
      	int n=s.nextInt();
		      long[] dams=new long[n];
		      for(int i=0;i<n;i++)dams[i]=s.nextInt();
		      long sum=0;
		      for(int i=0;i<n-1;i++){
		    	if(i%2==0)sum+=dams[i]*2;
		        else sum-=dams[i]*2;
		      }
		      long tempsum=sum+dams[n-1]*2;
		      tempsum/=2;
		      long[] mountains=new long[n];
		      mountains[0]=tempsum;
		      for(int i=1;i<n;i++){
		      	mountains[i]=dams[i-1]*2-mountains[i-1];
		      }
		      for(int i=0;i<n;i++){
		      	System.out.print(mountains[i]+" ");
		      }
     }
}