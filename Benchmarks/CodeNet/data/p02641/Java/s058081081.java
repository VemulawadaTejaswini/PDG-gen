import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		if (n == 0) {
			System.out.println(x);
			return;
		}
		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		int ans = 101;
		int minres = 101;
		List<Integer> p_ = new ArrayList<>();
		for (int i = 0; i <= 101; i++) {
			if (!p.contains(i)) {
				p_.add(i);
			}
		}
		for (int i : p_) {
			if (Math.abs(x - i) < minres) {
				minres = Math.abs(x - i);
				ans = i;
			}
		}
		System.out.println(ans);
	}

}
