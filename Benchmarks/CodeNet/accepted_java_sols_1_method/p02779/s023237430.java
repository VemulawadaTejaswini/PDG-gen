import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		sc.close();

		if (set.size() == n) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
