import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Alchemy {

	public static void input_data(int n) {

		for (int i = 0; i < n; i++) {

			String[] name_cost = Main.sc.nextLine().split(" ");
			String name = name_cost[0];
			int cost = Integer.parseInt( name_cost[1] );
			Main.item_data.put(name, cost);
		}

	}

	public static void input_recipe(int m) {
		for (int i = 0; i < m; i++) {
			String[] recipe = Main.sc.nextLine().split(" ");

			String output = recipe[0];
			int prod_fee = 0;

			int k = Integer.parseInt(recipe[1]);

				for (int j = 0; j < k; j++) {
					prod_fee += Main.item_data.get( recipe[2 + j] );
				}
			Main.item_data.put(output, Math.min( prod_fee, Main.item_data.get(output) ) );
		}

	}
}

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> item_data = new HashMap<String, Integer>();
	public static void main(String[] args) {

			while (sc.hasNext()) {
				int n = Integer.parseInt(sc.nextLine());
					if (n == 0) {
						break;
					}
				Alchemy.input_data(n);

				int m = Integer.parseInt(sc.nextLine());
				Alchemy.input_recipe(m);

				System.out.println(item_data.get( sc.nextLine() ));

				item_data.clear();
			}

		sc.close();
	}
}
