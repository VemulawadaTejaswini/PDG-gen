import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int ans =1;

			for(int i=1; i<=n;i++)
			{
				ans += i;
			}
			System.out.println(ans);
		}
	}
}