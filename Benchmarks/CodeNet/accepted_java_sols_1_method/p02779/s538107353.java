import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set A = new HashSet<Integer>();
		boolean prime = false;

		for (int i = 0; i < N; i ++) {
			A.add(sc.nextInt());
		}

		if (A.size() == N) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}