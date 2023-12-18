import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int D;
	int[] c;
	int[][] s;

	int[] ans;

	long score(int[] a, int dd) {
		int[] last = new int[26];

		long res = 0;

		for (int d = 0; d < dd; d++) {
			res += s[d][a[d]];
			last[a[d]] = d + 1;

			for (int j = 0; j < 26; j++) {
				res -= (c[j] * (d + 1 - last[j]));
			}
//			System.err.println(res);
		}
		return res ;
	}
	
	
	long score2(int[] a) {
		long res = 0;
		for(int i=0;i<26;i++) {
			res += scores(i, a);
		}
		return res;
	}
	//問題iについてのスコア
	long scores(int i, int[] a) {
		int last = 0;
		long res = 0;

		for (int d = 0; d < D; d++) {
			if(a[d] == i) {
				res += s[d][i];
				last = d + 1;
			}

			res -= (c[i] * (d + 1 - last));
		}
		return res ;		
	}

	public void _main(String[] args) {
		long st = System.currentTimeMillis();
		Scanner sc = new Scanner(in);

		D = sc.nextInt();
		c = new int[26];
		for (int i = 0; i < 26; i++) {
			c[i] = sc.nextInt();
		}

		s = new int[D][26];
		for (int i = 0; i < D; i++) {
			for (int j = 0; j < 26; j++) {
				s[i][j] = sc.nextInt();
			}
		}

		sc.close();

		ans = new int[D];


		for(int d=0;d<D;d++) {
			long max = score(ans, d+1);
			
			for(int i=0;i<26;i++) {
				int t = ans[d];
				ans[d] = i;
				long s = score(ans, d+1);
				
				if(s > max) {
					max = s;
				}else {
					ans[d] = t;
				}
			}
		}
		
//		System.err.println(score(ans,D));
//		System.err.println(score2(ans));
		
		Random random = new Random();
		long max = score(ans, D);
		while (System.currentTimeMillis() - st < 1900) {
			int d = random.nextInt(D);
			int i = random.nextInt(26);
			
			int t = ans[d];
			if(t==i) continue;
			
			long s = 0;
			s -= scores(i,ans);
			s -= scores(t,ans);
			
			ans[d] = i;
			
			s += scores(i, ans);
			s += scores(t, ans);
			
			if(s > 0) {
				max += s;
			}else {
				ans[d] = t;
			}
		}

//		System.err.println(max);

		StringBuilder sb = new StringBuilder();
		for (int x : ans) {
			sb.append(x+1);
			sb.append("\n");
		}
		out.print(sb.toString());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
