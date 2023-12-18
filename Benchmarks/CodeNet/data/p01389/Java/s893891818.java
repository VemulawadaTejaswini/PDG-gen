import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int dx[]={1,0};
		int dy[]={0,1};
		while(in.hasNext())
		{
			int H=in.nextInt();
			int W=in.nextInt();
			int cost[][]=new int[H][W];
			int map[][]=new int[H][W];
			LinkedList<String>que=new LinkedList<String>();
			for(int i=0;i<H;i++)
			{
				Arrays.fill(cost[i], 1000);
				String st=in.next();
				for(int j=0;j<W;j++)
					map[i][j]=Integer.valueOf(st.charAt(j)-'0');
			}
			cost[0][0]=0;
			que.add(0+" "+0);
			while(!que.isEmpty())
			{
				int size=que.size();
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int nh=Integer.valueOf(now[0]);
					int nw=Integer.valueOf(now[1]);
					for(int j=0;j<2;j++)
					{
						int h=dy[j]+nh;
						int w=dx[j]+nw;
						if(h<H&&w<W)
						{
							if(cost[h][w]>cost[nh][nw]+map[h][w])
							{
								cost[h][w]=cost[nh][nw]+map[h][w];
								que.add(h+" "+w);
							}
						}
					}
				}
			}
			System.out.println(cost[H-1][W-1]);
		}
	}
}