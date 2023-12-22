import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Map<String, Integer> blueCards = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			if (blueCards.containsKey(s)) {
				// 同一文字列登録済ならばvalueをインクリメント
				blueCards.put(s, blueCards.get(s) + 1);
			} else {
				// 初めて登場した文字列はvalue=1で追加
				blueCards.put(s, 1);
			}
		}
		
		int m = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < m; i++) {
			String t = sc.nextLine();
			if (blueCards.containsKey(t)) {
				// 同一文字列登録済ならばvalueをデクリメント
				blueCards.put(t, blueCards.get(t) - 1);
			}
			// 青いカードに存在しない文字の場合は、そもそもプラスになりえないので読み捨て
			// 青いカードがすべてマイナスならば0が最大となる
			// (-1となりえる文字列の組み合わせの最大数は99種類だが長さ10の英小文字の文字列の組み合わせはそれ以上に存在し得る)
		}
		
		// Mapをvalueの降順にソートする
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(blueCards.entrySet());
		Collections.sort(list_entries, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());});
		
		int max = list_entries.get(0).getValue();
		
		if (max < 0) {
			System.out.println(0);
		} else {
			System.out.println(max);
		}
		
		sc.close();
	}
}