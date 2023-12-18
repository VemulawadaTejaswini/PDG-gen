import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			while (sc.hasNextLine()) {
				String[] s = sc.nextLine().split(",");
				map.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
			}

			int totalPrice = 0;
			int totalQuantity = 0;
			for (int unitPrice : map.keySet()) {
				int quantity = map.get(unitPrice);
				totalPrice += unitPrice * quantity;
				totalQuantity += quantity;
			}

			int quantityAve = new BigDecimal(totalQuantity).divide(
					new BigDecimal(map.size()), RoundingMode.HALF_UP)
					.intValue();

			System.out.println(totalPrice);
			System.out.println(quantityAve);

		} finally {
			sc.close();
		}
	}
}