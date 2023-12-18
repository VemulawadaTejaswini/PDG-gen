import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		String str3 = str2.substring(0, str1.length()) ;
			String ans = "No";

		if (str3.compareTo(str1)==0) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
