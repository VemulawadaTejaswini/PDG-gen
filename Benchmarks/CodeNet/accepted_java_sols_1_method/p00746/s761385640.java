import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;
			int x[]=new int[N];
			int y[]=new int[N];
			x[0]=y[0]=1;
			for(int i=1;i<N;i++)
			{
				int pre=in.nextInt();
				int dir=in.nextInt();
				x[i]=x[pre]+(dir==0 ? -1 : dir==2 ? 1 : 0);
				y[i]=y[pre]+(dir==1 ? -1 : dir==3 ? 1 : 0);
			}
			Arrays.sort(x);
			Arrays.sort(y);
			System.out.println((x[N-1]-x[0]+1)+" "+(y[N-1]-y[0]+1));
		}
	}
}