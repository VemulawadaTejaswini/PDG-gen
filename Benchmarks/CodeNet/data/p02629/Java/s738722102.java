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
			if (26 < tmp) {
				ans.add(tmp/l);
			} else {
				ans.add(tmp);
			}
			tmp -= l*(tmp/l);
		}
		StringBuilder sb = new StringBuilder();
		for (Long a : ans) {
			char c = (char)('a'-1+a);
			sb.append(c);
		}
		System.out.println(N == 1 ? "a" :sb);
	}
}