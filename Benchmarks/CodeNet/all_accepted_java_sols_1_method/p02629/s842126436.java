import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong()-1;
		long val = 26;
		int cnt = 1;
		while (N >= val) {
			cnt++;
			N -= val;
			val *= 26;
		}
		StringBuilder sb = new StringBuilder();
		long tmp = N;
		for (int i=0;i<cnt;i++) {
			sb.append((char)((int)'a'+(tmp%26)));
			tmp /= 26;
		}

		StringBuilder ans = new StringBuilder();
		for (int i=0;i<cnt;i++) {
			ans.append(sb.charAt(cnt-1-i));
		}
		System.out.println(ans);
	}
}