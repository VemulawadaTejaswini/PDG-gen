import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		String ans = (n + 1)/2 >= k ? "YES" : "NO";

		System.out.println(ans);

		sc.close();
	}

}
