import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	static int H,W;
	static char field[][];
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int I=0;I<T;I++)
		{
			if(I!=0)
				System.out.println();
			int H=in.nextInt();
			int W=in.nextInt();
			int sh=0;
			int sw=0;
			int dir=0;
			field=new char[H][W];
			for(int i=0;i<H;i++)
			{
				char ch[]=in.next().toCharArray();
				for(int j=0;j<W;j++)
				{
					field[i][j]=ch[j];
					if(ch[j]=='>'||ch[j]=='v'||ch[j]=='<'||ch[j]=='^')
					{
						 sh=i;
						 sw=j;
						 field[i][j]='.';
					}
					if(ch[j]=='^')
						dir=1;
					else if(ch[j]=='>')
						dir=2;
					else if(ch[j]=='v')
						dir=3;
					else if(ch[j]=='<')
						dir=4;
				}
			}
			
			int N=in.nextInt();
			char d[]=in.next().toCharArray();
			
			for(int i=0;i<N;i++)
			{
				
				if(d[i]=='U')
				{
					dir=1;
					if(sh-1>=0&&field[sh-1][sw]=='.')
						sh--;
				}
				else if(d[i]=='R')
				{
					dir=2;
					if(sw+1<W&&field[sh][sw+1]=='.')
						sw++;
				}
				else if(d[i]=='D')
				{
					dir=3;
					if(sh+1<H&&field[sh+1][sw]=='.')
						sh++;
				}
				else if(d[i]=='L')
				{
					
					dir=4;
					if(sw-1>=0&&field[sh][sw-1]=='.')
						sw--;
				}
				else
				{
					int nh=sh;
					int nw=sw;
					if(dir==1)
					{
						while(nh>=0)
						{
							if(field[nh][nw]=='*')
							{
								field[nh][nw]='.';
								break;
							}
							else if(field[nh][nw]=='#')
								break;
							nh--;
						}
					}
					else if(dir==2)
					{
						while(nw<W)
						{
							if(field[nh][nw]=='*')
							{
								field[nh][nw]='.';
								break;
							}
							else if(field[nh][nw]=='#')
								break;
							nw++;
						}
					}
					else if(dir==3)
					{
						while(nh<H)
						{
							if(field[nh][nw]=='*')
							{
								field[nh][nw]='.';
								break;
							}
							else if(field[nh][nw]=='#')
								break;
							nh++;
						}
					}
					else if(dir==4)
					{
						while(nw>=0)
						{
							if(field[nh][nw]=='*')
							{
								field[nh][nw]='.';
								break;
							}
							else if(field[nh][nw]=='#')
								break;
							nw--;
						}
					}
				}
			}
			if(dir==1)
				field[sh][sw]='^';
			else if(dir==2)
				field[sh][sw]='>';
			else if(dir==3)
				field[sh][sw]='v';
			else if(dir==4)
				field[sh][sw]='<';
			
			for(int i=0;i<H;i++)
			{
				System.out.println();
				for(int j=0;j<W;j++)
					System.out.print(field[i][j]);
			}
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}