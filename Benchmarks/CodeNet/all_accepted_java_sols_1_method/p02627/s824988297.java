import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String ans="A";
		sc.close();
		if (a.compareTo("a")>=0 && a.compareTo("z")<=0) ans = "a";
		System.out.println(ans);
	}
}
