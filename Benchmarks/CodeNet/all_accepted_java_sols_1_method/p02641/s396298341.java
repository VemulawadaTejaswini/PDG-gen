import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		sc.close();

		int d = -1;
		int now = x;
		while (true) {
			if (!set.contains(now)) {
				System.out.println(now);
				return;
			}
			now += d;
			d *= -1;
			if (d < 0) {
				d--;
			} else {
				d++;
			}
		}
	}
}
