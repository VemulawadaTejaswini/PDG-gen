import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) {

			int A = sc.nextInt();
			if(set.contains(A)) {
				System.out.println("NO");
				return;
			}
			set.add(A);
		}
		System.out.println("YES");
	}
}