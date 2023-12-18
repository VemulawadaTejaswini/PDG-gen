import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static final long MOD = 1000000007;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Set<String> S = new HashSet<>();

		for (int i = 0; i < N; i++) {
			S.add(scan.next());
		}

		System.out.println(S.size());
	}
}