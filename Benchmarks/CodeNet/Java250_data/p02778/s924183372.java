import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double[] d = new double[50];

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = str.length();

		String ans = "";
		for (int i=0; i<n; i++) {
			ans = ans + "x";
		}
		System.out.println(ans);
	}
}