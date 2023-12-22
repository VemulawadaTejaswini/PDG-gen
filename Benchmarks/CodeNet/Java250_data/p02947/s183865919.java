import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String s[] = new String[N];
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
		}
		for(int i = 0; i < N; i++) {
			String t = s[i].substring(0, 1);
			for(int j = 1; j < 10; j++) {
				String temp = s[i].substring(j, j + 1);
				int c = 0;
				in : while(c < t.length()) {
					if(temp.compareTo(t.substring(c, c + 1)) < 0) {
						t = t.substring(0, c) + temp + t.substring(c);
						break in;
					}
					c++;
					if(c >= t.length()) {
						t = t + temp;
						break in;
					}
				}
			}
			s[i] = t;
		}
		
		Arrays.sort(s);
		boolean flag = false;
		long cnt = 0;
		long ans = 0;
		for(int i = 1; i < N; i++) {
			if(s[i].equals(s[i - 1])) {
				cnt++;
				flag = true;
			} else {
				if(flag) {
					cnt++;
					long sum = 0;
					if(cnt % 2 == 0) {
						sum = cnt / 2 * (cnt - 1);
					} else {
						sum = (cnt - 1) / 2 * cnt;
					}
					ans += sum;
					flag = false;
					cnt = 0;
				}
			}
		}
		if(flag) {
			cnt++;
			long sum = cnt * (cnt - 1) / 2;
			ans += sum;
		}
		System.out.println(ans);
	}
}
