import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Map<String, Integer> map = new TreeMap<>();
		int max = 0;

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			// すでに同じ文字があったら
			if(map.containsKey(s)) {
				// valに加算
				map.put(s, map.get(s) + 1);
			}else{
				map.put(s, 1);
			}
			max = Math.max(max, map.get(s));
		}

		for(String key: map.keySet()) {
			// maxと等しいkeyを出力
			if(map.get(key) == max) {
				System.out.println(key);
			}
		}
	}
}