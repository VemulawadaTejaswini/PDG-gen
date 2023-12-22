import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ans = 1;
		if (n>1) {
				ans = n * (n-1) /2;
		} else {
			ans = 0;
		}

		int ans2 = 1;
		if (m>1) {
			ans2 = m * (m-1) /2;
		} else {
			ans2 = 0;
		}

		sc.close();
		System.out.println(ans+ans2);
	}
}
