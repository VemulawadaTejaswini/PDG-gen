import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		int m = 0;
		long ans = 0;
		long sum = 0;

		n = sc.nextLong();
		m = sc.nextInt();

		for (int i = 0; i < m; i++) 
			sum += sc.nextInt();
		

		if (n - sum >= 0)
			ans = n - sum;
		else
			ans = -1;
		System.out.print(ans);
		sc.close();
	}
}