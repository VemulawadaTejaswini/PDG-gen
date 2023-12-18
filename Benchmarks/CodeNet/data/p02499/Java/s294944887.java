import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		printAnswer();
	}

	private static void printAnswer() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			HashMap<String, Integer> alphCountingMap = makeAlphabetCountingMap(br.readLine().toLowerCase());

			for(Entry<String, Integer> e : alphCountingMap.entrySet()) {
			    System.out.println(e.getKey() + " : " + e.getValue());
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static HashMap<String, Integer> makeAlphabetCountingMap(String dataSet) {
		HashMap<String, Integer> alphCountingMap = new HashMap<String, Integer>();
		char alphabet = 'a';
		for (int i = 0; i <= ('z' - 'a'); i++) {
			alphCountingMap.put(String.valueOf(alphabet++), 0);
		}

		for (Integer i = 0; i < dataSet.length(); i++) {
			String apperedAlph = dataSet.substring(i, i+1);
			if (alphCountingMap.containsKey(apperedAlph)){
				  int count = alphCountingMap.get(apperedAlph);
				  alphCountingMap.put(apperedAlph, ++count);
				}
		}

		return alphCountingMap;
	}
}