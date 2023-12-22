import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int n = sc.nextInt();
		List<String> wordsList = new ArrayList<String>();
		Set<String> checkHash = new HashSet<String>();
		// 整数値の数だけ文字列を標準入力
		for(int i = 0; i < n; i++) {
			wordsList.add(sc.next());
			if(i >= 1) {
				// 文字列の先頭文字と1つ前の文字列の末尾文字を比較
				if(!(wordsList.get(i).substring(0, 1).equals(wordsList.get(i - 1).substring(wordsList.get(i - 1).length() - 1)))) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		// 重複している文字列が存在するか
		for(String str : wordsList) {
			if(checkHash.contains(str)) {
				System.out.println("No");
				System.exit(0);
			} else {
				checkHash.add(str);
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}