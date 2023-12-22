import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		if(N % K == 0) {
			System.out.println(0);
			return;
		}
		System.out.println(Math.min(N, Math.abs(N % K - K)));
	}
}
