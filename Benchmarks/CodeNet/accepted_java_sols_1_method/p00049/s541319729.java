import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		int a = 0;
		int b = 0;
		int o = 0;
		int ab = 0;
		
		while (sc.hasNext())
		{
			sc.nextInt();
			String str = sc.next();
			if (str.equals("A"))
			{
				a++;
			}
			else if (str.equals("B"))
			{
				b++;
			}
			else if (str.equals("O"))
			{
				o++;
			}
			else if (str.equals("AB"))
			{
				ab++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
}