import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int k = Integer.parseInt(sc.next());

		StringBuilder sb = new StringBuilder(s);

		char c = s.charAt(k - 1);

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != c) {
				sb.setCharAt(i, '*');
			}
		}

		System.out.println(sb.toString());

		sc.close();
	}

}
