import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			System.out.print("3C");
			int x = sc.nextInt() % 39;
			System.out.println(x == 0 ? 39 : x);
		}
	}
}