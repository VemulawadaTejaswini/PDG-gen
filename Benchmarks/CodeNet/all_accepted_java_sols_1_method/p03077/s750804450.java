import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] capacities = new long[] { sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong(), sc.nextLong() };
		sc.close();

		long min = capacities[0];
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, capacities[i]);
		}

		long cnt = (long) Math.ceil(N * 1.0 / min);
		System.out.println(4l + cnt);
	}
}
