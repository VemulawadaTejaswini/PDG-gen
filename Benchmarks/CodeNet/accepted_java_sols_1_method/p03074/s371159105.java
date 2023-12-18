import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		
		int cnt = 0;
		int ans = 0;
		int c = 0;
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(0);
		cnt++;
		
		for(int i = 0; i < N - 1; i++) {
			if(!S.substring(i, i + 1).equals(S.substring(i + 1, i + 2))) {
				if(S.substring(i, i + 1).equals("1")) {
					if(cnt > K) {
						cnt--;
						ans = Math.max(ans, i + 1 - ary.get(c));
						c++;
					}
				} else {
					ary.add(i + 1);
					cnt++;
				}
			}
		}
		ans = Math.max(ans, N - ary.get(c));
		System.out.println(ans);
	}
}
