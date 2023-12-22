import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputs = br.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);

		int rival[][] = new int[N + 1][N]; // pのn番目の対戦相手 r = tb[p][n]  (1-origin 
		int mday[][] = new int[N + 1][N];  // pのn番目の試合日   d = tb[p][n]  (1-origin 

		// p:player  r:rival
		for ( int p = 1; p <= N; p++ ) {
			inputs = br.readLine().split(" ");
			for ( int n = 1; n <= N - 1; n++ ) {
				int r = Integer.parseInt(inputs[n - 1]);
				rival[p][n] = r;
			}
		}

		int match = N * (N - 1) / 2;
		int days = 0;
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		int[] prog = new int[N + 1];				   // p が何試合目まで進んだか =  prog[p]
		// キューの初期化
		for ( int p = 1; p <= N; p++ ) {
			int r = rival[p][1];
			if ( p == rival[r][1] && mday[p][1] * mday[r][1] == 0 ) {

				mday[p][1] = mday[r][1] = 1;
				prog[p] = prog[r] = 1;

				q.addLast(p);
				q.addLast(r);
			}
		}

//		for ( Integer is : q ) {
//			System.out.println(is);
//		}

		while ( 0 < q.size() ) {
			int p = q.pollFirst();
			int pn = prog[p] + 1;
			if ( pn >= N ) continue;
			int r = rival[p][pn];
			int rn = prog[r] + 1;
			if ( rn >= N ) continue;
			// System.out.println("check p:" + p + " pn:" + pn + " r:" + r + " rn:" + rn);

			// 試合が成立したら試合日テーブルに記入
			if ( p == rival[r][rn] ) {
				// System.out.println(p + " vs " + r);

				mday[p][pn] = mday[r][rn] = Math.max(mday[p][pn - 1] + 1, mday[r][rn - 1] + 1);

				prog[p]++;
				q.addLast(p);

				prog[r]++;
				q.addLast(r);

			}
		}

//		for ( int[] is : mday ) {
//			for ( int i : is ) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}

		int lastMatchDay = 0;
		for ( int p = 1; p <= N; p++ ) {
			int d = mday[p][N - 1];
			if ( d == 0 ) {
				lastMatchDay = -1;
				break;
			} else {
				lastMatchDay = Math.max(lastMatchDay, d);
			}
		}

		System.out.println(lastMatchDay);
		br.close();
	}
}
