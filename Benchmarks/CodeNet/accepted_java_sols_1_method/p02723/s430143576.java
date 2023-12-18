import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		String ans = "No";
		sc.close();
		if (c[2]==c[3] && c[4]==c[5]) {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}