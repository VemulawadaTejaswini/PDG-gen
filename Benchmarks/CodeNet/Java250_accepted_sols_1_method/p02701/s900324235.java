import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> S = new HashSet<>();
		for(int i = 0; i < N; i++) {
			S.add(sc.next());
		}
		sc.close();
		System.out.println(S.size());
	}
}
