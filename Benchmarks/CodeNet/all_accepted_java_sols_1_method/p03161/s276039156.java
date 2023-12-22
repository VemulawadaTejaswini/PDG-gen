//package AtCoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			sc.close();
			
			if(n==1)
			{
				System.out.println(0);
				return;
			}
			int[] cost=new int[n];
			cost[0]=0;
			cost[1]=Math.abs(a[1]-a[0]);
			for(int i=2;i<n;i++)
			{
				int check=k;
				int j=i-1;
				int min=Integer.MAX_VALUE;
				while(check-->0 && j>=0)
				{
					min=Math.min(min,Math.abs(a[i]-a[j])+cost[j]);
					j--;
					//check--;
				}
				cost[i]=min;
				
			}
			

	
				System.out.println(cost[n-1]);

		

	}

}
