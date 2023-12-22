import java.util.*;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int h[]=new int[n];
		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}
		double min=10000;
		int ans=0;

		for(int i=0;i<n;i++){
			if(min>=Math.abs(a-t+h[i]*0.006)){
				min=Math.abs(a-t+h[i]*0.006);
				ans=i+1;
			}
		}

		System.out.println(ans);


	}
}
