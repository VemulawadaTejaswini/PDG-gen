import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		do
		{
			String s = "F";
			int F = scanner.nextInt();
			int B = scanner.nextInt();
			int R = scanner.nextInt();
			int FB = F + B;
			boolean fb = F < 0;
			boolean bb = B < 0;
			boolean rb = R < 0;
			if(fb && bb && rb)
			{
				break;
			}
			if(fb || bb)
			{
				System.out.println(s);
				continue;
			}
			if(FB >= 80)
			{
				s = "A";
			}
			else
			if(FB >= 65)
			{
				s = "B";
			}
			else
			if(FB >= 50 || R >= 50)
			{
				s = "C";
			}
			else
			if(FB >= 30)
			{
				s = "D";
			}
			System.out.println(s);
		}
		while(true);
	}
}