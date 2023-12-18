import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();

		long ans = a == b ? 1 : n - 2 < 0 || a > b ? 0 : (n - 2) * (b - a) + 1;
		System.out.println(ans);

		sc.close();
	}

}
