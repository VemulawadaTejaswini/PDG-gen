import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long mod = (long)Math.pow(10, 9)+7;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		long power = 1L;
		for(int i = 2;i <= N;i++) {
			power = ((power%mod)*i)%mod;
		}
		System.out.println(power);
	}
}