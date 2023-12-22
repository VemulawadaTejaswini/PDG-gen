import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 1000; i <= 10000; i += 1000)
			if (n <= i) {
				ans = i - n;
				break;
			}
		System.out.println(ans);
		sc.close();
	}
}