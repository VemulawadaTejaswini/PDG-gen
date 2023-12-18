import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	static Main main = new Main();
	static HashMap<String, Item> itemTable = new HashMap<String, Item>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int m = 0, n = 0;
			String target;

			n = Integer.parseInt(line);
			for (int i = 0; i < n; i++) {
				Item item = getItemInstance(br.readLine());
				itemTable.put(item.name, item);
			}

			m = Integer.parseInt(br.readLine());
			for (int i = 0; i < m; i++) {
				setRecipe(br.readLine());
			}

			target = br.readLine();
			System.out.println(itemTable.get(target).getPriceMin());
		}
	}

	class Item {
		String name;
		int price;
		int priceMin;
		int recipeCount;
		ArrayList<Item> recipe;

		Item(String name, int price) {
			this.name = name;
			this.price = price;
			priceMin = -1;
			recipeCount = 0;
		}

		int getPriceMin() {
			int alchemize = 0;
			if (priceMin != -1) {
				return priceMin;
			} else {
				if (recipeCount == 0) {
					return price;
				} else {
					for (Item i : recipe) {
						if (i != null)
							alchemize += i.getPriceMin();
					}
					priceMin = alchemize;
				}
			}
			return priceMin;
		}
	}

	static Item getItemInstance(String info) {
		int n = info.indexOf(' ');
		String name = info.substring(0, n);
		int price = Integer.parseInt(info.substring(n + 1));
		return main.new Item(name, price);
	}

	static void setRecipe(String info) {
		StringTokenizer st = new StringTokenizer(info);
		Item item = itemTable.get(st.nextToken());
		item.recipeCount = Integer.parseInt(st.nextToken());
		item.recipe = new ArrayList<Item>();
		while (st.countTokens() > 0) {
			item.recipe.add(itemTable.get(st.nextToken()));
		}
	}
}