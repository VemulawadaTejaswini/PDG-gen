import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String ans = "No";
		char[] c = str.toCharArray();
		for (int i=0; i < str.length(); i++) {
			if (c[i] == '7') {
				ans = "Yes";

				break;
			}
		}

		System.out.println(ans);
	}
}
