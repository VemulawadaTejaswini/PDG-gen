import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Set<Integer> A = new HashSet<>();
		for (int i = 0; i < N; i++) {
			int a = in.nextInt();
			if (A.contains(a)) {
				A.remove(a);
			} else {
				A.add(a);
			}
		}
		System.out.println(A.size());
		in.close();
	}
}