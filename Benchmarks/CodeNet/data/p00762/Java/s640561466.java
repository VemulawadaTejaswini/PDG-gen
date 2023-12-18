import java.util.*;
public class Main
{
	static int dx[]={1,0,-1,0};
	static int dy[]={0,1,0,-1};
	static int field[][];
	static int dice[][];
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);

		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			field=new int[31][31];//高低差を管理
			dice=new int[31][31];//フィールドのダイスの状態
			for(int i=0;i<n;i++)
			{
				int t=in.nextInt();
				int f=in.nextInt();
				drop(15,15,t,f);
			}
			
			int ans[]=new int[7];
			for(int i=0;i<31;i++)
				for(int j=0;j<31;j++)
					ans[dice[i][j]]++;
			for(int i=1;i<6;i++)
				System.out.print(ans[i]+" ");
			System.out.println(ans[6]);
		}
	}

	static void drop(int x,int y,int t,int f)
	{
		boolean possible[]=new boolean[4];//その方向に落ちる事ができるか
		for(int i=0;i<4;i++)
		{
			if(field[x][y]>field[x+dx[i]][y+dy[i]])
				possible[i]=true;
		}
		if(t==1)
		{
			if(f==2)
			{
				if(possible[2])
					drop(x-1,y,2,6);
				else if(possible[3])
					drop(x,y-1,3,2);
				else
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==3)
			{
				if(possible[1])
					drop(x,y+1,2,3);
				else if(possible[2])
					drop(x-1,y,3,6);
				else
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==5)
			{
				if(possible[0])
					drop(x+1,y,2,1);
				else if(possible[1])
					drop(x,y+1,3,5);
				else
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==4)
			{
				if(possible[3])
					drop(x,y-1,2,4);
				else if(possible[0])
					drop(x+1,y,3,1);
				else
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}

		}
		else if(t==2)
		{
			if(f==1)
			{
				if(possible[2])
					drop(x-1,y,1,5);
				else if(possible[1])
					drop(x,y+1,3,1);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==4)
			{
				if(possible[1])
					drop(x,y+1,1,4);
				else if(possible[0])
					drop(x+1,y,3,2);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==6)
			{
				if(possible[0])
					drop(x+1,y,1,2);
				else if(possible[3])
					drop(x,y-1,3,6);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==3)
			{
				if(possible[3])
					drop(x,y-1,1,3);
				else if(possible[2])
					drop(x-1,y,3,5);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
		}
		else if(t==3)
		{
			if(f==1)
			{
				if(possible[2])
					drop(x-1,y,1,4);
				else if(possible[3])
					drop(x,y-1,2,1);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==2)
			{
				if(possible[1])
					drop(x,y+1,1,2);
				else if(possible[2])
					drop(x-1,y,2,4);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==6)
			{
				if(possible[0])
					drop(x+1,y,1,3);
				else if(possible[1])
					drop(x,y+1,2,6);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==5)
			{
				if(possible[3])
					drop(x,y-1,1,5);
				else if(possible[0])
					drop(x+1,y,2,3);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
		}
		else if(t==4)
		{
			if(f==1)
			{
				if(possible[2])
					drop(x-1,y,1,3);
				else if(possible[1])
					drop(x,y+1,2,1);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==5)
			{
				if(possible[1])
					drop(x,y+1,1,5);
				else if(possible[0])
					drop(x+1,y,2,4);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==6)
			{
				if(possible[0])
					drop(x+1,y,1,4);
				else if(possible[3])
					drop(x,y-1,2,6);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==2)
			{
				if(possible[3])
					drop(x,y-1,1,2);
				else if(possible[2])
					drop(x-1,y,2,3);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
		}
		else if(t==5)
		{
			if(f==1)
			{
				if(possible[2])
					drop(x-1,y,1,2);
				else if(possible[3])
					drop(x,y-1,3,1);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==3)
			{
				if(possible[1])
					drop(x,y+1,1,3);
				else if(possible[2])
					drop(x-1,y,3,2);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==6)
			{
				if(possible[0])
					drop(x+1,y,1,5);
				else if(possible[1])
					drop(x,y+1,3,6);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==4)
			{
				if(possible[3])
					drop(x,y-1,1,4);
				else if(possible[0])
					drop(x+1,y,3,5);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
		}
		else if(t==6)
		{
			if(f==2)
			{
				if(possible[2])
					drop(x-1,y,2,1);
				else if(possible[1])
					drop(x,y+1,3,2);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==4)
			{
				if(possible[1])
					drop(x,y+1,2,4);
				else if(possible[0])
					drop(x+1,y,3,6);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==5)
			{
				if(possible[0])
					drop(x+1,y,2,6);
				else if(possible[3])
					drop(x,y-1,3,5);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
			else if(f==3)
			{
				if(possible[3])
					drop(x,y-1,2,3);
				else if(possible[2])
					drop(x-1,y,3,1);
				else//もう落ちることができない
				{
					field[x][y]++;
					dice[x][y]=t;
					return;
				}
			}
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}

	static public void debug2(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
				System.out.print(a[i][j]);
			System.out.println();
		}
	}
}