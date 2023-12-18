import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		boolean isFollowRule = true;
		Set set = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			set.add(S[i]);
			if (i != 0 && !(S[i - 1].substring(S[i - 1].length() - 1).equals(S[i].substring(0, 1)))) {
				isFollowRule = false;
			}
		}

		if (N == set.size() && isFollowRule) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
