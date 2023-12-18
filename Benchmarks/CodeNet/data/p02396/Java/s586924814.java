import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int inputInt = 0;
		int index = 0;
		Map<String, Integer> map = new LinkedHashMap<>();
		while((inputInt = Integer.parseInt(input.readLine())) != 0) {
			map.put("Case " + (++index) + ": ", inputInt);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}

}

