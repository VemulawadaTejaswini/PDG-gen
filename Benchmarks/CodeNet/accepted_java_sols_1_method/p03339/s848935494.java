import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int ans = n;
		int cnt[] = new int[n];
		for(int i = 0; i < n; ++i) {
			if(i != 0)cnt[i] = cnt[i - 1];
			if(s.charAt(i) == 'W')++cnt[i];
		}
		for(int i = 0; i < n; ++i) {
			int tmp = i + 1 - cnt[i];
			int tmp2 = n - cnt[n - 1];
			tmp = tmp2 - tmp;
			int tmp3 = cnt[i];
			if(s.charAt(i) == 'W')--tmp3;
			tmp += tmp3;
			ans = Math.min(ans, tmp);
		}
		System.out.println(ans);
	}

}
