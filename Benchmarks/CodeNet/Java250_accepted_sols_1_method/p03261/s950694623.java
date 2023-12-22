import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String W[] = new String[N];
		Set<String> se = new HashSet<String>();
		for (int i = 0; i < N; i++) {
			W[i] = sc.next();
		}
		se.add(W[0]);
		sc.close();

		for (int i = 1; i < N; i++) {
			char c1 = W[i - 1].charAt(W[i - 1].length() - 1);
			char c2 = W[i].charAt(0);
			if (c1 != c2) {
				System.out.println("No");
				return;
			}
			if (se.contains(W[i])) {
				System.out.println("No");
				return;
			}
			se.add(W[i]);
		}
		System.out.println("Yes");
	}
}
