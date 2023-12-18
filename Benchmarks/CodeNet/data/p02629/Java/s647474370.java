import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long num = 1;
		long index = 0;
		while (num < N) {
			num *= 26;
			index++;
		}
		List<Long> ts = new ArrayList<>();
		for (long i = index-1; -1 < i; i--) {
			ts.add((long) Math.pow(26, i));
		}
		long tmp = N;
		List<Long> ans = new ArrayList<>();
		for (Long l : ts) {
			if (26 <= tmp) {
				ans.add(tmp/l);
			} else {
				ans.add(tmp);
			}
			tmp -= l*(tmp/l);
		}
		StringBuilder sb = new StringBuilder();
		boolean next = false;
		for (int i = 0; i < ans.size(); i++) {
			Long n = ans.get(ans.size()-1-i);
			if (next) {
				n--;
				next = false;
			}
			if (i == ans.size()-1 && n == 0) {
				continue;
			}
			if (n < 1) {
				sb.append("z");
				next = true;
			} else {
				char c = (char)('a'-1+n);
				sb.append(c);
			}
		}
		System.out.println(N == 1 ? "a" :sb.reverse());
	}
}