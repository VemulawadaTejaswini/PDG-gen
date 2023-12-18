import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int in;
		int count = 1;
		while(true)
		{
			in = sc.nextInt();
			if(in == 0)
			{
				break;
			}
			System.out.println("Case " + count++ + ": " + in);
		}
		sc.close();
	}
}
