import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		TreeMap<Integer, Integer[]> trade = new TreeMap<Integer, Integer[]>();

		boolean lastMonth = false;
		int customer = 0;

		while ((line = br.readLine()) != null) {
			if (line.isEmpty()) {
				lastMonth = true;
				continue;
			} else {
				customer = Integer.parseInt(line.split(",")[0]);
			}
			
			if (!lastMonth) {
				if (trade.containsKey(customer)) {
					trade.get(customer)[0]++;
				} else {
					trade.put(customer, new Integer[2]);
					trade.get(customer)[0] = 1;
					trade.get(customer)[1] = 0;
				}
			} else {
				if (trade.containsKey(customer)) {
					trade.get(customer)[1]++;
				}
			}
		}
		for (Integer k : trade.keySet()) {
			if (trade.get(k)[1] > 0)
				System.out.println(k + " "
						+ (trade.get(k)[0] + trade.get(k)[1]));
		}
	}
}