import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		String line;
		while ((line = bf.readLine()) != null) {
			String[] s = line.split(",");
			if (s.length < 2)
				break;
			Integer k = Integer.valueOf(s[0]);
			Integer v = map.get(k);
			if (v == null)
				v = Integer.valueOf(0);
			v--;
			map.put(k, v);
		}
		while ((line = bf.readLine()) != null) {
			String[] s = line.split(",");
			if (s.length < 2)
				break;
			Integer k = Integer.valueOf(s[0]);
			Integer v = map.get(k);
			if (v == null)
				continue;
			if (v < 0)
				v = -v;
			v++;
			map.put(k, v);
		}
		while (!map.isEmpty()) {
			Entry<Integer, Integer> e = map.pollFirstEntry();
			if (e.getValue() > 0)
				System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}