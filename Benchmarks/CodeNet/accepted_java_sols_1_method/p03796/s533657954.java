import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = 1000000007;
		int N  = sc.nextInt();
		long ans = 1;
		for(int i = 2; i <= N; i++) {
			ans = ans * i % w;
		}
		System.out.println(ans);
	}
}