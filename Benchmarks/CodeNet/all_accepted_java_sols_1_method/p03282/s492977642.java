import java.util.*;

// ARC 98-D
// https://beta.atcoder.jp/contests/arc098/tasks/arc098_b

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] s = in.next().toCharArray();
		long K = in.nextLong();
		
		char answer = '1';
		if (K < s.length) {
			boolean isAnswer1 = true;
			for (int i = 0; i < K; i++) {
				if (s[i] != '1') {
					isAnswer1 = false;
				}
			}
			if (isAnswer1) {
				System.out.println(1);
				return;
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != '1') {
				answer = s[i];
				break;
			}
		}
		
		System.out.println(answer);
    }
}
