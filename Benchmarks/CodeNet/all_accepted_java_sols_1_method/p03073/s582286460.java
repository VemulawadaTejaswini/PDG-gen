import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		//int num = Integer.parseInt(s, 2);

		int whitefirst = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' == i % 2) {
				whitefirst++;
			}
		}

		int blackfirst = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' != i % 2) {
				blackfirst++;
			}
		}

		System.out.println(Math.min(whitefirst, blackfirst));
		sc.close();
	}
}