import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int ans = 11;
		int buf = 0;
		int a = 0;
		int b = 0;
		for (long i=1; i<=Math.sqrt(n); i++) {
			if (n % i == 0) {
				a = String.valueOf(i).length();
				b = String.valueOf(n/i).length();
				if (a>b) break;
				if (ans > b) ans = b;
				if (a==b) break;
			}
		}
		System.out.println(ans);
	}
}
