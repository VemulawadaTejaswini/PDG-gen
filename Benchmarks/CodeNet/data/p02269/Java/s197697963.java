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
	 * メイン。
	 * 
	 * @param args 未使用
	 */
	public static void main(String[] args) {

		try {
			// 読み込み
			int n = Integer.parseInt(bufferedReader.readLine());
			
			// 辞書用配列
			Set<String> dictionary = new HashSet<>();
			
			// コマンドを読み込む
			String[] command = new String[2];
			final String SPACE = " ";
			for (int i = 0; i < n; i++) {
				command = bufferedReader.readLine().split(SPACE);
				if(command[0].equals("insert")) {
					// 挿入を実行
					dictionary.add(command[1]);
				} else if (command[0].equals("find")) {
					// 検索を実行
					if (dictionary.contains(command[1])) {
						stringBuilder.append("yes\n");
					} else {
						stringBuilder.append("no\n");
					}
				}
			}
			
			// 読み込み終了
			bufferedReader.close();
			bufferedReader = null;
	
			// 結果出力
			System.out.print(stringBuilder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

