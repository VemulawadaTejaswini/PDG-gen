import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long t = sc.nextInt(), a = sc.nextInt();
		for(int i = 1; i < N; i++) {
			int T = sc.nextInt();
			int A = sc.nextInt();
			long m = Math.max((t+T-1)/T, (a + A-1)/A);
			t = m * T;
			a = m * A;
		}
		System.out.println(t+a);
	}

}
