import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		
		int[][] curr   =new int[3][2];
		int[][] next   =new int[3][2];
		for(int i=0; i<3; i++)
			curr[i][0]=1;
		
		int[]   dayPlan=new int[N];
		for(int i=0; i<K; i++)
			dayPlan[sc.nextInt()-1] = sc.nextInt();
		
		for(int i=0; i<N-1; i++)
		{
			if(dayPlan[i] != 0)
			{
				for(int j=0; j<3; j++)
				{
					if(j != dayPlan[i]-1)
					{
						curr[j][0] = 0;
						curr[j][1] = 0;
					}
				}
			}
			for(int j=0; j<3; j++)
			{
				for(int k=0; k<3; k++)
					if(j==k){ next[k][1]+=curr[j][0]; next[k][1]%=10000; }
					else    { next[k][0]+=curr[j][0]; next[k][0]%=10000; }
				
				for(int k=0; k<3; k++)
					if(j!=k){ next[k][0]+=curr[j][1]; next[k][0]%=10000; }
			}
			
			for(int j=0; j<3; j++)
			{
				curr[j][0]=next[j][0];
				curr[j][1]=next[j][1];
				next[j][0]=0;
				next[j][1]=0;
			}
		}
		
		int ans = 0;
		for(int i=0; i<3; i++)
		{
			if(dayPlan[N-1]==0 || i==dayPlan[N-1]-1)
				ans += curr[i][0]+curr[i][1];
		}
		ans %= 10000;
		System.out.println(ans);
	}
	
}