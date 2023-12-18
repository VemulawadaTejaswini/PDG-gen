
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scanner.nextLine());
			if (n == 0)
				break;
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			StringTokenizer[] tokenizers = new StringTokenizer[n];
			for (int i = 0; i < n; i++) {
				tokenizers[i] = new StringTokenizer(scanner.nextLine());
			}
			String a = scanner.nextLine();
			for (StringTokenizer to : tokenizers) {
				while (to.hasMoreTokens()) {
					String st = to.nextToken();
					if (!st.startsWith(a))
						continue;
					int sum = 1;
					if (map.containsKey(st)) {
						sum = map.get(st) + 1;
					}
					map.put(st, sum);
				}
			}
			Map<String, Integer> sortMap = new TreeMap<String,Integer>(new MapComp(map));
			sortMap.putAll(map);
			int count =0;
			boolean flag = true;
			for(String ans: sortMap.keySet()){
				if(count ==0){
					System.out.print(ans);
					flag = false;
				}else
					System.out.print(" "+ ans);
				if(count==4)
					break;
				count++;
			}
			if(flag)
				System.out.println("NA");
			else
				System.out.println();
		}
	}

	class MapComp implements Comparator<String> {
		Map<String, Integer> map;

		public MapComp(Map<String, Integer> map) {
			super();
			this.map = map;
		}

		@Override
		public int compare(String a, String b) {
			int v1 = map.get(a);
			int v2 = map.get(b);
			if (v1 == v2)
				return a.compareTo(b);
			return v2 - v1;
		}

	}
}