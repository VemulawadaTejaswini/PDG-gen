import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		String input;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			input = String.valueOf(br.readLine());
		}

		Map<String, Integer> count = new HashMap<String, Integer>();

		for(int i = 0; i < input.length(); i++) {
			String chr = input.substring(i, i+1);
			if (count.containsKey(chr)) {
				count.put(chr, count.get(chr) + 1);
			} else {
				count.put(chr, 1);
			}
		}

		for(Entry<String, Integer> entry: count.entrySet()) {
			Integer value = entry.getValue();
			if(value % 2 ==1) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
	}
}