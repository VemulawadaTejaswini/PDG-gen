import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while(n--!=0)
		{
			int y=in.nextInt();
			int m=in.nextInt();
			int d=in.nextInt();
			int yc =0;
			int mc =0;
			for(int i=1;i<y;i++)
			{	
				if(i%3==0)
					yc+=200;
				else
					yc+=195;
			}
			for(int j=1;j<m;j++)
			{
				if(y%3==0||j%2!=0)
					mc+=20;
				else
					mc+=19;
			}
			System.out.println(196471-yc-mc-d);
		}
	}
}