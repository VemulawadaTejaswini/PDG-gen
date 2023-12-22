import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String ans = "ARC";
		if (str.compareTo(ans) == 0) {
			ans = "ABC";
		}
		System.out.println(ans);
	}
}
