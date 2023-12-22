
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		end: {
			while (true) {
				String str = br.readLine();
				switch (str.substring(0, 2)) {

				case "in":
					// insert????????????
					int insert = Integer.parseInt((String) str.subSequence(7, str.length()));
					int key = 2000000000 - insert;
					map.put(key, insert);
					queue.add(key);
					
					break;

				case "ex":
					// extract????????????
					key = queue.poll();
					sb.append(map.get(key) + "\n");
					break;

				case "en":
					// end??\??????????????????
					break end;
				}
			}
		}
		System.out.print(sb.toString());
	}
}