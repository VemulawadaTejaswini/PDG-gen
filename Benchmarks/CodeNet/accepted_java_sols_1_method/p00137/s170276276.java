import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			System.out.println("Case " + Integer.toString(i+1) + ":");
			int s = sc.nextInt();
			for (int j = 0; j < 10; j++)
			{
				s *= s;
				StringBuffer buf = new StringBuffer(Integer.toString(s));
				while (buf.length() < 8)
				{
					buf.insert(0, '0');
				}
				s = Integer.parseInt(buf.substring(2, 6));
				System.out.println(s);
			}
		}
	}
}