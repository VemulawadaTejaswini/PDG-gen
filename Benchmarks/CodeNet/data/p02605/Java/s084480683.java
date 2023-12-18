import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	static int inf = 123456789;
	static int max_coord = 200001;
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] S = new int[N];
		int[] T = new int[N];
		int[] ord = new int[N];
		int[] cnt = new int[max_coord + 1];
		int[] pa = new int[max_coord * 2 + 1];
		int[] pb = new int[max_coord * 2 + 1];
		char[] D = new char[N];
		for(int i = 0; i < N; ++i) {
			String[] sp = br.readLine().split(" ");
			X[i] = Integer.parseInt(sp[0]);
			Y[i] = Integer.parseInt(sp[1]);
			D[i] = sp[2].charAt(0);
		}
		int ans = inf;
		Arrays.fill(cnt, 0);
		for(int i = 0; i < N; ++i) ++cnt[Y[i] + 1];
		for(int i = 0; i < max_coord; ++i) cnt[i + 1] += cnt[i];
		for(int i = 0; i < N; ++i) pa[cnt[Y[i]]++] = i;
		Arrays.fill(cnt, 0);
		for(int i = 0; i < N; ++i) ++cnt[X[i] + 1];
		for(int i = 0; i < max_coord; ++i) cnt[i + 1] += cnt[i];
		for(int i = 0; i < N; ++i) ord[cnt[X[pa[i]]]++] = pa[i];
		for(int i = 0; i < N; ++i) pa[i] = X[ord[i]];
		for(int i = 0; i < N; ++i) X[i] = pa[i];
		for(int i = 0; i < N; ++i) pa[i] = Y[ord[i]];
		for(int i = 0; i < N; ++i) Y[i] = pa[i];
		for(int i = 0; i < N; ++i) pa[i] = (int)D[ord[i]];
		for(int i = 0; i < N; ++i) D[i] = (char)pa[i];
		for(int i = 0; i < N; ++i) {
			S[i] = X[i] + Y[i];
			T[i] = X[i] - Y[i] + max_coord;
		}
		// CALCULATION - direction #1
		Arrays.fill(pa, -inf);
		Arrays.fill(pb, -inf);
		for(int i = 0; i < N; ++i) {
			if(D[i] == 'U') pa[X[i]] = Y[i];
			if(D[i] == 'R') pb[Y[i]] = X[i];
			if(D[i] == 'D') ans = Math.min(ans, Y[i] - pa[X[i]]);
			if(D[i] == 'L') ans = Math.min(ans, X[i] - pb[Y[i]]);
		}
		// CALCULATION - direction #2
		Arrays.fill(pa, -inf);
		Arrays.fill(pb, -inf);
		for(int i = 0; i < N; ++i) {
			if(D[i] == 'D') pa[S[i]] = T[i];
			if(D[i] == 'R') pb[S[i]] = T[i];
			if(D[i] == 'L') ans = Math.min(ans, T[i] - pa[S[i]]);
			if(D[i] == 'U') ans = Math.min(ans, T[i] - pb[S[i]]);
		}
		// CALCULATION - direction #3
		Arrays.fill(pa, -inf);
		Arrays.fill(pb, -inf);
		for(int i = 0; i < N; ++i) {
			if(D[i] == 'U') pa[T[i]] = S[i];
			if(D[i] == 'R') pb[T[i]] = S[i];
			if(D[i] == 'L') ans = Math.min(ans, S[i] - pa[T[i]]);
			if(D[i] == 'D') ans = Math.min(ans, S[i] - pb[T[i]]);
		}
		// PRINT THE ANSWER
		if(ans == inf) {
			System.out.println("SAFE");
		}
		else {
			System.out.println(ans * 5);
		}
	}
}