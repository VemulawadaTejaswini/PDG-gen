import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int k = n % 10;
		String ans = "pon";
		if (k == 2 || k ==4  || k ==5  || k ==7  || k ==9 ) {
			ans = "hon";
		} else if (k == 3) {
			ans = "bon";
		}
		System.out.println(ans);
	}
}
