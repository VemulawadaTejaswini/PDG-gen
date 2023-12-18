import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while (sc.hasNext())
		{
			String str = sc.next();
			int n = str.length();
			loop: {
				for (int i = 0; i < n; i++)
				{
					if (str.charAt(i) != str.charAt(n - (i + 1)))
						break loop;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}