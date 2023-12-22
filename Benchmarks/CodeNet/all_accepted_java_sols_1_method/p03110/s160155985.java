import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int VALUE = 0;
		final int TYPE = 1;

		Map<String, Double> rateMap = new HashMap<>();
		rateMap.put("JPY", 1.0);
		rateMap.put("BTC", 380000.0);

		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		double sum = 0;
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			double value = Double.valueOf(input[VALUE]);
			double rate = rateMap.get(input[TYPE]);
			sum = sum + value * rate;
		}
		System.out.println(sum);
		sc.close();
	}
}
