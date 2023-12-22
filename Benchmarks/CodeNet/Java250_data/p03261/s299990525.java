import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] w = new String[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.next();
		}
		sc.close();

		Set<String> set = new HashSet<>();
		set.add(w[0]);
		for (int i = 1; i < n; i++) {
			if (!set.add(w[i]) || w[i - 1].charAt(w[i - 1].length() - 1) != w[i].charAt(0)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
