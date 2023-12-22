import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		sc.close();

		int max = 0;
		for (int i = 0; i <= S.length - T.length; i++) {
			int cnt = 0;
			for (int j = 0; j < T.length; j++) {
				if (S[i + j] == T[j]) {
					cnt++;
				}
			}
			max = Math.max(max, cnt);
		}

		System.out.println(T.length - max);
	}
}
