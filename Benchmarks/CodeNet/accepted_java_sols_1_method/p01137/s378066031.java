import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		double EPS=1e-10;
		for(;;)
		{
			int e=in.nextInt();
			if(e==0)
				return;
			int ans=Integer.MAX_VALUE;
			for(int z=0;z*z*z<=e;z++)
			{
				int y=(int) (Math.sqrt(e-z*z*z));
				int x=e-z*z*z-y*y;
				ans=Math.min(ans, x+y+z);
			}
			System.out.println(ans);
		}
	}
}