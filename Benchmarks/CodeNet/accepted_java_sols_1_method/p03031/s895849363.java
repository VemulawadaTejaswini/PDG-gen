import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		// 電球ごとのスイッチパターンを作成
		int[] switchPatterns = new int[m];		
		for ( int i = 0; i < m; i++ ) {
			int k = in.nextInt();
			for ( int j = 0; j < k; j++ ) {
				switchPatterns[i] += 1<< (in.nextInt() - 1);
			}
		}
		
		// pの受け取り
		int[] p = new int[m];		
		for ( int i = 0; i < m; i++ ) {
			p[i] = in.nextInt();
		}

		int Allpatterns = 2 << (n - 1); // 2のn乗
		int cnt = Allpatterns;

		// スイッチのパターンを上限まで列挙
		for ( int ptr = 0; ptr < Allpatterns; ptr++ ) {
			// 電球ごとのパターンと照らし合わせる
			for ( int i = 0; i < m; i++ ) {
				if ( Integer.bitCount(ptr & switchPatterns[i]) % 2 != p[i] ) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
		in.close();
	}
}
