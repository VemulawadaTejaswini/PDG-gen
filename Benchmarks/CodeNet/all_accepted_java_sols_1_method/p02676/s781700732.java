import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.nextLine();
		str = sc.nextLine();
		sc.close();
		int l = str.length();
		String ans = "Yes";
		if (k >= l ) {
			ans = str;
			System.out.println(ans);

		} else {
			ans = str.substring(0, k);
			System.out.println(ans+"...");

		}
	}
}
