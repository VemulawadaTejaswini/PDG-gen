import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int max = 0;
		for (int i = 1; i <= N - 1; i++) {
			Set<Character> xset = new HashSet<>();
			Set<Character> yset = new HashSet<>();
			for (int j = 0; j < N; j++) {
				(j < i ? xset : yset).add(S.charAt(j));
			}
			xset.retainAll(yset);
			max = Integer.max(xset.size(), max);
		}
		System.out.println(max);
	}
}