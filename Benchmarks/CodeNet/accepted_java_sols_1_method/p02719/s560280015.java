
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ret = N;
		long r = ret - K * (N / K);
		ret = Math.min(ret, r);
		ret = Math.min(ret, Math.abs(r - K));
		System.out.println(ret);
	}
}
