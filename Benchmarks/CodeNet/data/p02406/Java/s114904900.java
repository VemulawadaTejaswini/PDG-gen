
import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{

		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		while(i<=n)
		{
			int x = i;
			if(x%3 ==0)
			{
				System.out.print(" "+i);
				continue;
			}
			while(x>=10)
			{
				if(x % 10 == 3)
				{
					System.out.print(" "+i);
					break;
				}
				x/=10;
			}
			i++;
		}
		System.out.println();
	}
}