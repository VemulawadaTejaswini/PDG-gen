import java.util.Scanner;

public class Main 
{
	public static void main(String[] Arguments)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for (int i = 0; i < S.length(); i += 2) System.out.print(S.charAt(i));
	}
}
