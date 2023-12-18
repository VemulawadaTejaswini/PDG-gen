import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			Map<String, List<Integer>> map = new LinkedHashMap<String, List<Integer>>();
			List<Integer> list = new ArrayList<Integer>();
			map.put("S", new ArrayList<Integer>());
			map.put("H", new ArrayList<Integer>());
			map.put("C", new ArrayList<Integer>());
			map.put("D", new ArrayList<Integer>());
			String input = br.readLine();
			int sheet = Integer.parseInt(input);
			int i;
			for (i = 0; i < sheet; i++) {
				String[] inputList = br.readLine().split(" ");
				list = map.get(inputList[0]);
				list.add(Integer.parseInt(inputList[1]));
				map.put(inputList[0], list);
			}

			for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
				list = e.getValue();
				for (i = 1; i <= 13; i++) {
					if (!list.contains(i)) {
						System.out.println(e.getKey() + " " + i);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}