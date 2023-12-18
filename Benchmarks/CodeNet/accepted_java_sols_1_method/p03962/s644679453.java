import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		while (sc.hasNext()) {
			String penki = sc.next();
			if (!map.containsKey(penki)) {
				map.put(penki, 1);
			}
		}
		int ret = 0;
		Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			// nextを使用して値を取得する
			Map.Entry<String, Integer> entry = itr.next();
			ret++;
		}
		System.out.println(ret);
	}

}