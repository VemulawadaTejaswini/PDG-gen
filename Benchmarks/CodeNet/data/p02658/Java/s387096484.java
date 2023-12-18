import java.util.*;

public class Main {

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
			if (ans > (long) Math.pow(10, 18)) {
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
