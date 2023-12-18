import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		sc.close();

		int ans = 0;
		long now = 100;
		while (now < x) {
			now = (long) (now * 1.01);
			ans++;
		}
		System.out.println(ans);
	}
}
