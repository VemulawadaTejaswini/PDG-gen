import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int n2 = 'z' - 'a';
		int cnt[][] = new int[n][n2 + 1];
		for(int i = 0; i < n; ++i) {
			if(i != 0) {
				for(int j = 0; j < n2 + 1; ++j) {
					cnt[i][j] = cnt[i - 1][j];
				}
			}
			int tmp = s.charAt(i) - 'a';
			cnt[i][tmp]++;
		}
		int ans = 0, a = 0;
		for(int i = 0; i < n; ++i) {
			a = 0;
			for(int j = 0; j < cnt[i].length; ++j) {
				int tmp = cnt[n - 1][j] - cnt[i][j];
				if(Math.min(tmp,  cnt[i][j]) > 0)++a;
			}
			ans = Math.max(ans, a);
		}
		System.out.println(ans);

	}

}
