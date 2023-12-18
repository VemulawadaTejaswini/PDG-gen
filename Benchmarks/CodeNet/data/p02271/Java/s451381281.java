import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	 * 配列内の数値を足し合わせて該当数になるかを計算します。
	 * @param target 該当数
	 * @param currentNum 現在の数
	 * @param array 配列
	 * @param index 足し合わせる数のインデックス
	 * @return 足し合わせて該当数になった場合はtrue、いずれの組み合わせでもならなかった場合はfalse
	 */
	private static boolean calc(int target, int currentNum, int[] array, int index) {
		if (target == currentNum) {
			stringBuilder.append("yes\n");
			return true;
		} else {
			boolean isNumber = false;
			for (int i = index + 1; i <= array.length; i++) {
				if(isNumber) {
					return isNumber;
				} else {
					isNumber = calc(target, currentNum + array[index], array, i);
					if (isNumber) {
						return isNumber;
					} else {
						isNumber = calc(target, array[index], array, i);
					}
				}
			}
			return isNumber;
		}
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
			int n = Integer.parseInt(bufferedReader.readLine());
			String[] aStr = bufferedReader.readLine().split(SPACE);
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(aStr[i]);
			}
			
			int q = Integer.parseInt(bufferedReader.readLine());
			String[] mStr = bufferedReader.readLine().split(SPACE);
			int[] m = new int[n];
			for (int i = 0; i < q; i++) {
				m[i] = Integer.parseInt(mStr[i]);
			}
			
			// 読み込み終了
			bufferedReader.close();
			bufferedReader = null;
			
			// sort
			Arrays.sort(a);
			
			// 足し合わせて該当数になるか
			for (int i = 0; i < q; i++) {
				if(!calc(m[i], 0, a, 0)) {
					stringBuilder.append("no\n");
				}
			}
			
			// 結果出力
			System.out.print(stringBuilder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

