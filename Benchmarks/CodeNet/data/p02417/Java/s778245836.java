import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String abc = "abcdefghijklmnopqrstuvwxyz";
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			int i;
			for (i = 0; i < abc.length(); i++) {
				map.put(abc.substring(i, i + 1), 0);
			}
			String input = br.readLine();
//			while (!input.equals("")) {
				for (i = 0; i < input.length(); i++) {
					String c = input.substring(i, i + 1).toLowerCase();
					if (map.containsKey(c)) {
						map.put(c, map.get(c) + 1);
					}
				}
//				input = br.readLine();
//			}
			for (Map.Entry<String, Integer> e : map.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}