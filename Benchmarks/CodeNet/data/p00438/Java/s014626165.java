import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static int cnt[][];
	static int obs[][];
	static int a,b;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			a=in.nextInt();
			b=in.nextInt();
			if((a|b)==0)
				return;
			int o=in.nextInt();
			obs=new int[a][b];
			cnt=new int[a][b];
			for(int i=0;i<a;i++)
				Arrays.fill(cnt[i], -1);
			for(int i=0;i<o;i++)
				obs[in.nextInt()-1][in.nextInt()-1]=1;
			System.out.println(count(0,0));
		}
	}
	static int count(int x,int y)
	{
		if (cnt[x][y] >= 0)  //すでに数えている場合
			return cnt[x][y];
		if (x==a-1&&y==b-1)
			return 1;
		int res=0;
		if (x+1<a&&obs[x+1][y]!=1)
			res+=count(x+1,y);
		if(y+1<b&&obs[x][y+1]!=1)
			res+=count(x,y+1);
		return cnt[x][y] = res;	
	}
}