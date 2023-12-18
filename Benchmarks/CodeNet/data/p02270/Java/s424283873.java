import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ZAKIREN第5章 4-6.データ構造の応用
 * 
 * @author tdi5277
 *
 */
public class Main {
	/** 入力用 */
	private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	
	/** 出力用 */
	private static StringBuilder stringBuilder = new StringBuilder();
	
	/**
	 * トラックの積載量をチェック。
	 */
	private static int check(int p, int k, int[] w, int n) {
		int i = 0;
		// truckの数だけループ
		for (int j = 0; j < k; j++) {
			// max積載量になるまで
			int internalCapacity = 0;
			while (internalCapacity + w[i] <= p) {
				// 内容量を増やす
				internalCapacity += w[i];
				i++;
				
				// 全ての積載量を積むことができた場合
				if (i == n) {
					return n;
				}
			}
		}
		return i;
	}
	
	/**
	 * メイン。
	 * 
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		try {
			final String SPACE = " ";
			// 読み込み
			String[] temp = bufferedReader.readLine().split(SPACE);
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
						
			// n回ループ
			int[] w = new int[n];
			for (int i = 0; i < n; i++) {
				w[i] = Integer.parseInt(bufferedReader.readLine());
			}
			
			// 読み込み終了
			bufferedReader.close();
			bufferedReader = null;
	
			// 二分探索法でPを求める
			int left = 0;
			int right = n * 10000;
			int mid = 0;
			while (right - left > 1) {
				mid = (left + right) / 2;
				// そのPで積み込みきれるかチェック
				int size = check(mid, k, w, n);
				if (size >= n) {
					right = mid;
				} else {
					left = mid;
				}
			}
			stringBuilder.append(right);
			
			// 結果出力
			System.out.println(stringBuilder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

