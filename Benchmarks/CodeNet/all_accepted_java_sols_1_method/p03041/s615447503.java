import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);

		sb.setCharAt(k-1, Character.toLowerCase(s.charAt(k-1)));

		System.out.println(sb.toString());
	}
}
