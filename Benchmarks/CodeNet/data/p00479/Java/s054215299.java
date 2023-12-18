import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext())
		{
			int N = scan.nextInt();
			int K = scan.nextInt();
			for(int i=0;i<K;i++)
			{
				int x = scan.nextInt()-1;
				int y = scan.nextInt()-1;

				if(x>N/2)
					x = N-1-x;
				if(y>N/2)
					y = N-1-y;
				int ans = Math.min(x,y);
				System.out.println(ans%3+1);
			}
		}
	}
}