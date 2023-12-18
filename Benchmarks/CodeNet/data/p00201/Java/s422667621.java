import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0201
	static class WroughtGoldMaster {
		HashMap<String, Integer> item;
		Map<String,String[]> recipe;
		void min_price() {
			for(;;) {
				int n = Integer.parseInt(sc.nextLine()); //nextIntを使うと挙動がおかしくなる
				if(n == 0) break;
				item = new HashMap<String, Integer>();


				for(int i=0; i<n; i++) {
					String[] str = sc.nextLine().split(" ", 0);
					item.put(str[0], new Integer(str[1]));
				}

				int m = Integer.parseInt(sc.nextLine());
				recipe = new HashMap<String,String[]>();
				for(int i=0; i<m; i++) {
					String[] str = sc.nextLine().split(" ", 0);
					int num = Integer.parseInt(str[1]);
					String[] stuff = new String[num];
					for(int j=0; j<num; j++) {stuff[j] = str[j+2];}
					recipe.put(str[0], stuff);
				}

				String req_item = sc.nextLine();
				System.out.println(searchPrice(req_item));

			}
		}

		int searchPrice(String stuff) {
			int sum = 0;
			if(recipe.containsKey(stuff)) {
				for(int i=0; i<recipe.get(stuff).length; i++) {
					sum += searchPrice(recipe.get(stuff)[i]);
				}
			}else {
				sum = item.get(stuff);
			}
			if(item.containsKey(stuff) && sum > item.get(stuff)) sum = item.get(stuff);
			return sum;
		}
	}

	public static void main(String[] args) {
		//0201
		WroughtGoldMaster wgm = new WroughtGoldMaster();
		wgm.min_price();
	}
}