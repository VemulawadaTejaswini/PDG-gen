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
			System.out.println(itemTable.get(target).getMinCost());
		}
	}

	class Item {
		String name;
		int price;
		int recipeCount = 0;
		ArrayList<Item> recipe;

		Item(String name, int price) {
			this.name = name;
			this.price = price;
		}

		int getMinCost() {
			int min = 0;
			try {
				if (recipeCount == 0) {
					min = price;
				} else {
					for (Item i : recipe) {
						min += i.getMinCost();
					}
				}
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			return min < price ? min : price;
		}
	}

	static Item getItemInstance(String info) {
		int n = info.indexOf(" ");
		String name = info.substring(0, n);
		int price = Integer.parseInt(info.substring(n + 1));
		return main.new Item(name, price);
	}

	static void setRecipe(String info) {
		StringTokenizer st = new StringTokenizer(info);
		Item item = itemTable.get(st.nextToken());
		item.recipeCount = Integer.parseInt(st.nextToken());
		item.recipe = new ArrayList<Item>();
		while (st.hasMoreTokens()) {
			item.recipe.add(itemTable.get(st.nextToken()));
		}
	}
}