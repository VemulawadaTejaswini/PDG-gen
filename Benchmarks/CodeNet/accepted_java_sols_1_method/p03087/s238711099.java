import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		String S = sc.next();
		int l[] = new int[Q];
		int r[] = new int[Q];
		for(int i = 0; i < Q; i++) {
			l[i] = Integer.parseInt(sc.next());
			r[i] = Integer.parseInt(sc.next());
		}
		
		int cnt[] = new int[S.length()];
		for(int i = 0; i < S.length() - 1; i++) {
			if(S.substring(i, i + 2).equals("AC")) {
				cnt[i + 1] = cnt[i] + 1;
			} else {
				cnt[i + 1] = cnt[i];
			}
		}
		
		for(int i = 0; i < Q; i++) {
			System.out.println(cnt[r[i] - 1] - cnt[l[i] - 1]);
		}
	}
}
