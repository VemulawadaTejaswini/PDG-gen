import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] s = sc.next().toCharArray();
		List<Integer> ans_rev = new ArrayList<>();
		boolean ok = false;
		boolean[] used = new boolean[N+1];
		Queue<Integer> q = new ArrayDeque<>();
		q.add(N);
		while(q.size() > 0) {
			boolean first = true;
			int x = q.poll();
			for(int i = M; i >= 1; i--) {
				if(x-i <= 0) {
					ans_rev.add(M+x-i);
					ok = true;
					break;
				}
				if(!used[x-i] && s[x-i] == '0') {
					if(first) {
						ans_rev.add(i);
						q.add(x-i);
						first= false;
					}
				}
			}
		}
		if(!ok) {
			System.out.println(-1);
			return;
		}
		for(int i = ans_rev.size()-1; i >= 0; i--)
			System.out.print(ans_rev.get(i) + " ");
	}

}