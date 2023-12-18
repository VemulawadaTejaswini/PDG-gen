
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char C[] = S.toCharArray();
		int temp = 0;
		int ans = 0;
		String s = "";
		int n[] = new int[N];
		for (int i = 1; i < N; i++) {
			String s1 = S.substring(0, i);
			String s2 = S.substring(i, N);
			for (int j = 0; j < s1.length(); j++) {
				CharSequence cs = s1.substring(j, j + 1);
				if (s2.contains(cs) && !s.contains(cs)) {
					temp++;
				}
				s += cs;
			}
			if (temp > ans) {
				ans = temp;
			}
			temp = 0;
			s = "";
		}
		System.out.println(ans);
	}
}