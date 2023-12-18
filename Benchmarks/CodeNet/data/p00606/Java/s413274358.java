import java.util.LinkedList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String field[][]=
			{
				{"A","B","C"},
				{"D","E","F"},
				{"G","H","I"}	
			};
		int dx[]={1,0,0,-1};
		int dy[]={0,1,-1,0};
		for(;;)
		{
			int n=in.nextInt();//battery
			if(n==0)
				return;
			String te=in.nextLine();
			String str[]=in.nextLine().split(" ");
			String s=str[0];//start
			String t=str[1];//charge
			String b=str[2];//no-enter
			LinkedList<String>que=new LinkedList<String>();
			double ans=1;
			int sh=-1,sw=-1;
			int th=-1,tw=-1;
			boolean judge=false;
			boolean judge2=false;
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
				{
					if(s.equals(field[i][j]))
					{
						sh=i;
						sw=j;
					}
					if(t.equals(field[i][j]))
					{
						th=i;
						tw=j;
					}
				}
			que.add(sh+" "+sw);
			while(!que.isEmpty())
			{
				int size=que.size();
				for(int i=0;i<size;i++)
				{
					String now[]=que.poll().split(" ");
					int nh=Integer.valueOf(now[0]);
					int nw=Integer.valueOf(now[1]);
					if(n==0)
					{
						judge=true;
						if(nh==th&&nw==tw)
							judge2=true;
					}
					for(int j=0;j<4;j++)
					{
						int h=dy[j]+nh;
						int w=dx[j]+nw;
						if(h>=0&&h<3&&w>=0&&w<3&&!field[h][w].equals(b))
							que.add(h+" "+w);
					}
				}
				if(judge)
					break;
				n--;
				ans/=4;
			}
			if(!judge2)
				ans=0;
			System.out.printf("%.8f\n",ans);
		}
	}
}