import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ca=1;
		while(n-->0)
		{
			System.out.println("Case "+ca+":");
			int x = sc.nextInt();
			for(int i=0; i<10; i++)
			{
				x*=x;
				String str = String.valueOf(x);
				// str = x+"";
				while(str.length()<8)
				{
					str = "0"+str;
				}
				x = Integer.valueOf(str.substring(2,6));
				System.out.println(x);
			}
			ca++;
		}
	}
}