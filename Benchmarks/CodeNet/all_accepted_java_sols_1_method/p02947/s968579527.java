import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int N = scan.nextInt();
		String[] s = new String[N];

		for(int i = 0; i < N; i++) {
			s[i] = scan.next();
		}
		scan.close();

		// 文字列をソートして比較
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String sortString = null;
		int count = 0;
		long result = 0;
		// 文字型の配列に変換してからソート
		// ソート済の文字型配列を文字列型に変換する
		char[] charS = new char[10];
		for(int i = 0; i < N; i++) {
			charS = s[i].toCharArray();
			Arrays.sort(charS);
			sortString = String.valueOf(charS);
			if(map.containsKey(sortString)) {
				count = map.get(sortString);
				result += count;
				map.put(sortString, ++count);
			}else {
				map.put(sortString, 1);
			}
		}

		System.out.println(result);
	}

}
