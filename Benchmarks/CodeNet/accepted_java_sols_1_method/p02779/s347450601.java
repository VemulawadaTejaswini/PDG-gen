import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//AtCoder Beginner Contest 154
//C	Distinct or Not
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
			s.add(A[i]);
		}
		sc.close();

		String ans = "NO";
		if (A.length == s.size()) {
			ans = "YES";
		}
		System.out.println(ans);
	}
}
