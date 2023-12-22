import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next()); // ?¨?????????°

		int minv = 0, maxv = Integer.MIN_VALUE, r;

		minv = Integer.parseInt(sc.next());

		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			maxv = Integer.max(maxv, a - minv);
			minv = Integer.min(a, minv);
		}
		System.out.println(maxv);

	}
}