import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);

		while(sc.hasNext())
		{
			int a =sc.nextInt();
			int b =sc.nextInt();
			int n=sc.nextInt();
			int sum=0;
			int di = a%b; 
			while(n-->0)
			{
				sum += (di*10)/b;
				di = (di*10)%b;
				if(di == 0)
					break;
			}
			System.out.println(sum);
		}
	}

}