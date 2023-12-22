import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int n1 = Integer.parseInt(s);
		int n2 = 0;
		for (int i = 0; i < s.length(); i++)
		{
			n2 += Integer.parseInt(s.charAt(i) + "");
		}
		scan.close();
		System.out.println(n1 % n2 == 0 ? "Yes" : "No");
	}
}
