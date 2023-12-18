import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		int[] s = new int[1001];
		int sum;
		double m;
		double a2;
		
		//for(int j=0;j<1001;j++){s[j]=0;}
		
		while(true){
		 n =sc.nextInt();
		 if(n==0)break;
		 sum=0;
		 
		 for(i=0;i<n;i++){
			 s[i] =sc.nextInt();
			 sum=sum+s[i];}
			 
			 m=sum/n;
			 a2=0;
			 
		 for(i=0;i<n;i++){
			 a2=a2+((s[i]-m)*(s[i]-m))/n;
		 }	 
	 System.out.println((double)Math.sqrt(a2));		 	
	}
	}	
}