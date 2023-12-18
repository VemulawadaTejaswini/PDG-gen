import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		for (; sc.hasNext();) {
			int n = Integer.parseInt(sc.nextLine());
				if (n == 0) {
					break;
				}
			hasOverMillion(n);
		}

	}

	private static void hasOverMillion(int n) {
		Map<Integer, Long> sale_data = new LinkedHashMap<Integer, Long>();

			for (int i = 0; i < n; i++) {
				String[] str = sc.nextLine().split(" ");

				int e = Integer.parseInt(str[0]);
				int p = Integer.parseInt(str[1]);
				int q = Integer.parseInt(str[2]);

					if (sale_data.containsKey(e)) {
						sale_data.put(e, sale_data.get(e) +(long) ( p * q ) );
					} else {
						sale_data.put(e, (long) (p * q));
					}
			}

			boolean hasOverMillion = false;

			for(int key : sale_data.keySet() ) {
				long value = sale_data.get(key);
					if (value >= 1000000) {

						if (hasOverMillion == false) {
							hasOverMillion = true;
						}

						System.out.println(key);
					}
			}

			if (!hasOverMillion) {
				System.out.println("NA");
			}


	}

}
