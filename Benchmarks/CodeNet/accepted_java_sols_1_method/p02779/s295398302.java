import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < N; i++) {
			linkedHashSet.add(A[i]);
		}

		if (linkedHashSet.toArray().length == A.length) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}
