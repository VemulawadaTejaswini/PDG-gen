import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int hl = Integer.parseInt(sc.next());
		int wl = Integer.parseInt(sc.next());

		System.out.println((h - hl) * (w - wl));
		sc.close();
	}
}