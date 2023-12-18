import java.util.Scanner;
public class Main
{
	static int field[][];
	static int white,black,cnt,fb,fw;
	static int W,H;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			W=in.nextInt();
			H=in.nextInt();
			if((W|H)==0)
				return;
			field=new int[H][W];
			for(int i=0;i<H;i++)
			{
				String st=in.next();
				for(int j=0;j<W;j++)
				{
					if(st.charAt(j)=='.')
						field[i][j]=0;
					else if(st.charAt(j)=='W')
						field[i][j]=1;
					else if(st.charAt(j)=='B')
						field[i][j]=2;
				}
			}
			black=0;
			white=0;
			for(int i=0;i<H;i++)
			{
				for(int j=0;j<W;j++)
				{
					fb=0;
					fw=0;
					cnt=0;
					if(field[i][j]==0)
						solve(i,j);
				}
			}
			System.out.println(black+" "+white);
		}	
	}
	public static void solve(int h,int w)
	{
		field[h][w]=3;
		cnt++;
		if(h-1>=0&&field[h-1][w]==1)
			fw=1;
		if(h-1>=0&&field[h-1][w]==2)
			fb=1;
		if(h+1<H&&field[h+1][w]==1)
			fw=1;
		if(h+1<H&&field[h+1][w]==2)
			fb=1;
		if(w-1>=0&&field[h][w-1]==1)
			fw=1;
		if(w-1>=0&&field[h][w-1]==2)
			fb=1;
		if(w+1<W&&field[h][w+1]==1)
			fw=1;
		if(w+1<W&&field[h][w+1]==2)
			fb=1;
		if(h-1>=0&&w-1>=0&&field[h-1][w-1]==1)
			fw=1;
		if(h-1>=0&&w-1>=0&&field[h-1][w-1]==2)
			fb=1;
		if(h-1>=0&&w+1<W&&field[h-1][w+1]==1)
			fw=1;
		if(h-1>=0&&w+1<W&&field[h-1][w+1]==2)
			fb=1;
		if(h+1<H&&w+1<W&&field[h+1][w+1]==1)
			fw=1;
		if(h+1<H&&w+1<W&&field[h+1][w+1]==2)
			fb=1;
		if(h+1<H&&w-1>=0&&field[h+1][w-1]==1)
			fw=1;
		if(h+1<H&&w-1>=0&&field[h+1][w-1]==2)
			fb=1;
		
		if(h-1>=0&&field[h-1][w]==0)
			solve(h-1,w);
		if(h+1<H&&field[h+1][w]==0)
			solve(h+1,w);
		if(w-1>=0&&field[h][w-1]==0)
			solve(h,w-1);
		if(w+1<W&&field[h][w+1]==0)
			solve(h,w+1);

		if(fw==1&&fb==0)
		{
			white+=cnt;
			cnt=0;
			return;
		}
		else if(fw==0&&fb==1)
		{
			black+=cnt;
			cnt=0;
			return;
		}
		else if(fw==1&&fb==1)
		{
			cnt=0;
			return;
		}
	}
}