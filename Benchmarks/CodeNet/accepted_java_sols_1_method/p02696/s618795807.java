import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		long B = sc.nextLong();
		long N = sc.nextLong();
		sc.close();

		long m = Math.min(N, B - 1);
		long v = ((long) Math.floor((double) A * m / B) - A * (long) Math.floor((double) m / B));
		System.out.println(v);
	}
}
