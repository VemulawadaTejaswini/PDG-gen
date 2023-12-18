import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			int M=in.nextInt();
			if((N|M)==0)
				return;
			int p[]=new int[(N+1)*(N+1)+1];
			int cnt=0;
			int ans=0;
			//ArrayList<Integer> AL=new ArrayList<Integer>();
			int sum[]=new int[(N+1)*(N+1)+1];
			p[0]=0;
			for(int i=1;i<=N;i++)
				p[i]=in.nextInt();

			for(int i=0;i<=N;i++)
				for(int j=0;j<=N;j++)
				{
					//AL.add(p[i]+p[j]);
					sum[cnt++]=p[i]+p[j];
				}
			//Collections.sort(AL);
			Arrays.sort(sum);
			
			for(int i=0;i<cnt;i++)
			{
				
				int x=M-sum[i];
				if(x<0)
					continue;

				int right=cnt-1;
				int left=0;

				while(left<right)
				{
					int center=(left+right)/2;
					if(x>sum[center])
						left=center+1;
					else if(x<sum[center])
						right = center;
				}
				ans=Math.max(ans, sum[i]+sum[right-1]);
			}
			System.out.println(ans);
		}
	}
}