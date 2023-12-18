import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try
			{
				int n = sc.nextInt() + sc.nextInt();
				int i = 1;
				while (n >= 10)
				{
					n /= 10;
					i++;
				}
				System.out.println(Integer.toString(i));
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}