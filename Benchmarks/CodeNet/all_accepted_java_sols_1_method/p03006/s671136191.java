import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for ( int i = 0; i < n; i++ ) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		// ベクトルとその個数を格納するマップ
		HashMap<String, Integer> vectorCnt = new HashMap<>();
		String vec = "";

		// 総当たりで2点間のベクトルを見ていく b:ball
		for ( int b1 = 0; b1 < n; b1++ ) {
			for ( int b2 = 0; b2 < n; b2++ ) {

				int dx = x[b2] - x[b1];
				int dy = y[b2] - y[b1];				
				vec = String.valueOf(dx) + "_" + String.valueOf(dy);
              	// ↑ 配列ではなく文字列に変換しないとマップのキーとして機能しなかった

				// 0移動はカウントしない
				if ( !(dx == 0 && dy == 0) ) {
					// ベクトルがマップにあったら個数を加算
					if ( vectorCnt.containsKey(vec) ) {
						vectorCnt.put(vec, vectorCnt.get(vec) + 1);
					}
					// 無かったら登録して個数は１
					else {
						vectorCnt.put(vec, 1);
					}
				}
			}
		}

		// 同種ベクトルの個数の最大値を取得
		int maxV = 0;
		for ( Integer val : vectorCnt.values() ) {
			if ( maxV < val ) maxV = val;
		}

		System.out.println(n - maxV);
		in.close();
	}
}
