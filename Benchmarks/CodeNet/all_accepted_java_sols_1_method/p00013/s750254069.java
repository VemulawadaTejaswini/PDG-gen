import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int cb[] = new int[10+1];
		int index = 0;
		while(scan.hasNext())
		{
			
			int ca = scan.nextInt();
			if (ca == 0)
			{
				System.out.println(cb[index-1]);
				index--;
				continue;
			}
			cb[index] = ca;
			index++;
		}
	}
}