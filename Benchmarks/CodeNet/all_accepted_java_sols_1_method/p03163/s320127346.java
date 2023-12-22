//package AtCoder;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int w=sc.nextInt();
		
		int weight[]=new int[n];
		int value[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			weight[i]=sc.nextInt();
			value[i]=sc.nextInt();
		}
		
		long[][] ans=new long[n][w+1];
		
		for(int i=0;i<n;i++)
		{
			ans[i][0]=weight[i];
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=w;j++)
			{
				if(i==0)
				{
					if(j>=ans[i][0])
					ans[i][j]=value[i];
				}
				else
				{
					if(j<ans[i][0])
						ans[i][j]=ans[i-1][j];
					else
					{
						int left=(int)(j-ans[i][0]);
						if(left==0)
							ans[i][j]=Math.max(value[i], ans[i-1][j]);
						else
							ans[i][j]=Math.max(value[i]+ans[i-1][left], ans[i-1][j]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<=w;j++)
//			{
//				System.out.print(ans[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(ans[n-1][w]);

	}

}
