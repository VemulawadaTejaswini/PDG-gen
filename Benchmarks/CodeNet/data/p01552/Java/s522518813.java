import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * YAML
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		StringTokenizer query = new StringTokenizer(br.readLine(), ".");
		List<String> lines = new ArrayList<>();
		Obj[] objs = new Obj[50_000];

		//read
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			lines.add(line);
		}

		//parse
		for (int i = 0; i < lines.size(); i++) {
			String line1 = lines.get(i);

			//parent
			int n = 0;
			for (int j = 0; j < line1.length(); j++) {
				if (line1.charAt(j) == ' ') n++;
				else break;
			}
			if (objs[n] == null) {
				objs[n] = main.new Obj();
			}

			//prop
			words = line1.substring(n).split(":");
			if (words.length == 1) {
				//prop: object
				String line2 = lines.get(i + 1);
				//self
				int m = 0;
				for (int j = 0; j < line2.length(); j++) {
					if (line2.charAt(j) == ' ') m++;
					else break;
				}
				if (objs[m] == null) {
					objs[m] = main.new Obj();
				}
				String key = words[0];
				objs[n].props.put(key, main.new Prop<Obj>(objs[m]));
			} else {
				//prop: string
				String key = words[0];
				String string = words[1].substring(1);
				objs[n].props.put(key, main.new Prop<String>(string));
			}
		}

		Obj obj = objs[0];
		Object value = null;
		while (query.hasMoreTokens()) {
			value = obj.get(query.nextToken());
			if (value == null) break;
			if (value instanceof Obj) {
				obj = (Obj) value;
			} else {
				if (query.hasMoreTokens()) {
					value = null;
					break;
				}
			}
		}

		String ans = "";
		if (value == null) {
			ans = "no such property";
		} else if (value instanceof String) {
			ans = "string \"" + value + "\"";
		} else if (value instanceof Obj) {
			ans = "object";
		}
		System.out.println(ans);

	} //end main

	class Obj {
		Map<String, Prop> props;

		Obj() {
			props = new HashMap<>();
		}

		Object get(String key) {
			if (props.containsKey(key)) {
				return props.get(key).value;
			} else {
				return null;
			}
		}
	}

	class Prop<T> {
		T value;

		Prop(T value) {
			this.value = value;
		}
	}
}