import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int I=in.nextInt();
		while(I-->0)
		{
			int cnt=0;
			int X=in.nextInt(),Y=in.nextInt(),W=in.nextInt(),H=in.nextInt();
			int N=in.nextInt();
			for(int j=0;j<N;j++)
			{
				int x=in.nextInt(),y=in.nextInt();
				if(X<=x&&x<=X+W&&Y<=y&&y<=Y+H)
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}