import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		String ans = "Yes";
		if (str.compareTo("AAA") == 0 || str.compareTo("BBB") == 0 ) {
			ans = "No";
		}

		System.out.println(ans);
	}
}
