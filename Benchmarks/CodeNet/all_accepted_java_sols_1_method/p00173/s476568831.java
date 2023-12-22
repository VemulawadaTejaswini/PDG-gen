import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			System.out.print(sc.next() + " ");
			int n = sc.nextInt();
			int m = sc.nextInt();
			System.out.print(Integer.toString(n + m) + " ");
			System.out.println(n * 200 + m * 300);
		}
	}
}