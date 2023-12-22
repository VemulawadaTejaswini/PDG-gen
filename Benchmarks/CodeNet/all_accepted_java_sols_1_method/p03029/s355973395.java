import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());

		System.out.println((3 * a + p) / 2);

		sc.close();
	}
}