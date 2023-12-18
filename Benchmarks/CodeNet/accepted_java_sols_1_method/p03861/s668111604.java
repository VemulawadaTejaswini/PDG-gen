import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		sc.close();
		long ans = b / x - a / x;
		if (a % x == 0)
			ans++;
		System.out.println(ans);
	}
}