import java.util.Scanner;

public class Main {

	private static long mod = (long)Math.pow(10, 9)+7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		long sum = 0;
		for(int i = K;i <= N+1;i++){
			long res = (long)(N-i+1)*i+1;
			sum += res%mod;
		}
		System.out.println(sum%mod);
	}
}