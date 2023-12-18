import java.util.*;

public class Main {

	static long MAX = 1000000000000000000l;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 1;
		boolean hasZero = false;
		boolean isOver = false;
		for (int i = 0; i < N; i++) {
			long num = sc.nextLong();
			if (num == 0) {
				hasZero = true;
			}
			ans *= num;
			if (ans > MAX) {
				isOver = true;
			}
		}
		if (isOver) {
			if (hasZero) {
				System.out.println("0");
			} else {
				System.out.println("-1");
			}
		} else {
			System.out.println(ans);
		}
		sc.close();
	}
}
