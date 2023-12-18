import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < num; i++) {
				set.add(sc.nextInt());
			}
			if (num == set.size()) {
				System.out.print("YES");
			} else {
				System.out.print("NO");
			}
		}
	}
}