import java.util.ArrayList;
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
			int p[]=new int[N*N+1];
			int cnt=0;
			int ans=0;
			ArrayList<Integer> AL=new ArrayList<Integer>();
			p[0]=0;
			for(int i=1;i<=N;i++)
				p[i]=in.nextInt();

			for(int i=0;i<=N;i++)
				for(int j=0;j<=N;j++)
				{
					AL.add(p[i]+p[j]);
					++cnt;
				}
			Collections.sort(AL);

			for(int i=0;i<cnt;i++)
			{
				int x=M-AL.get(i);
				if(x<0)
					continue;

				int right=cnt-1;
				int left=0;

				while(left<right)
				{
					int center=(left+right)/2;
					if(x>AL.get(center))
						left=center+1;
					else if(x<AL.get(center))
						right = center;
				}
				ans=Math.max(ans, AL.get(i)+AL.get(right-1));
			}
			System.out.println(ans);
		}
	}
}