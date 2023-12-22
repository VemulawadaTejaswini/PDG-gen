import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] ac = new boolean[n];
		int[] wa = new int[n];
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if (s.equals("AC")) {
				ac[p - 1] = true;
			} else if (!ac[p - 1]) {
				wa[p - 1]++;
			}
		}
		sc.close();

		long acc = IntStream.range(0, n).filter(i -> ac[i]).count();
		long wac = IntStream.range(0, n).filter(i -> ac[i]).map(i -> wa[i]).sum();
		System.out.println(String.format("%d %d", acc, wac));
	}
}
