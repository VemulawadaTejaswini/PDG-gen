import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long A = sc.nextLong();
		final long B = sc.nextLong();
		final long C = sc.nextLong();
		final long K = sc.nextLong();
		sc.close();
		long ans = Math.min(A, K);
		ans -= (K-A-B)>0?(K-A-B): 0;
		System.out.println(ans);
	}
}
