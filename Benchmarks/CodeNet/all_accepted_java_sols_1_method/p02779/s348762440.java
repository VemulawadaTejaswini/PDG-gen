import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			HashSet<Integer> list = new HashSet<>();
			for (int i = 0; i < n; i++) {
				if (!list.add(sc.nextInt())) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}
	}
}
