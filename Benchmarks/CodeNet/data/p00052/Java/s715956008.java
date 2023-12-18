import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n;
		while((n=sc.nextInt())!=0) {
			solve(n);
		}
	}
	static void solve(int n) {
		long ans = 0L;
		for(int warusu = 5;warusu<=n;warusu*=5) {
			ans += n / warusu;
		}
		System.out.println(ans);
	}
}
