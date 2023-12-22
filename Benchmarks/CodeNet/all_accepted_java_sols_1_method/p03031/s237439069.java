import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] switchPatterns = new int[m][];
		int[] p = new int[m];
		for ( int i = 0; i < m; i++ ) {
			int k = in.nextInt();
			int[] s = new int[k];
			for ( int j = 0; j < k; j++ ) {
				s[j] = in.nextInt();
			}
			switchPatterns[i] = s;
		}
		for ( int i = 0; i < m; i++ ) {
			p[i] = in.nextInt();
		}

		int Allpatterns = 2 << (n - 1); // 2のn乗
		int cnt = Allpatterns;
//		boolean[] light = new boolean[Allpatterns];
//		Arrays.fill(light, true);

		// スイッチのパターンを上限まで列挙
		for ( int ptr = 0; ptr < Allpatterns; ptr++ ) {
			// 電球ごとのスイッチパターンと照らし合わせる
			for ( int d = 0; d < m; d++ ) {
				int temp = 0;
				for ( int i : switchPatterns[d] ) {
					// System.out.println("switch:" + i);
					//					int mask = 1 << (i - 1);
					//					temp += ((ptr & mask) >> (i - 1));

					temp += ptr >> i - 1 & 1; // 順序：四則演算 → ビットシフト → 論理演算 → 代入
				}
				// System.out.println("temp:" + temp);
				if ( temp % 2 != p[d] ) {
					//light[ptr] = false;
					cnt--;
					break;
				}
				// if(d == m-1)System.out.println("ptr:" + Integer.toBinaryString(ptr) + " is OK");
			}
		}

//		int cnt = 0;
//		for ( int i = 0; i < Allpatterns; i++ ) {
//			if ( light[i] ) {
//				// System.out.println(Integer.toBinaryString(i));
//				cnt++;
//			}
//		}

		System.out.println(cnt);

		// 確認用
		//		for ( int i = 0; i < m; i++ ) {
		//			System.out.print("電球 " + i + "     p: " + p[i] + "    s: ");
		//			for ( int j : switches[i] ) {
		//				System.out.print(j + " ");
		//			}
		//			//System.out.print(" p:" + p[i]);			
		//			System.out.println();
		//		}
		in.close();
	}
}
