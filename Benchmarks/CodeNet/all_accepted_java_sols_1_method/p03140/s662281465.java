import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		char[] C = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			HashSet<Character> set = new HashSet<>();
			set.add(A[i]);
			set.add(B[i]);
			set.add(C[i]);
			ans += set.size() - 1;
		}
		System.out.println(ans);
	}
}