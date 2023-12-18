
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			items = new Item[n]; 
			for (int i = 0; i < n; i++) {
				items[i] = new Item();
				items[i].name = sc.next();
				items[i].w = sc.nextInt();
				items[i].s = sc.nextInt();
			}
			
			int totalWeight = 0;
			for (Item item : items) totalWeight += item.w;
			
			bestG = Integer.MAX_VALUE;
			bestSeq = new Item[n];
			seq = new Item[n];
			dfs(0, 0, totalWeight);
			
			for (Item item: bestSeq) {
				System.out.println(item.name);
			}
		}
	}

	void dfs(int depth, int curG, int remainWeight) {
		if (depth == items.length) {
			if (bestG > curG) {
				bestG = curG;
				bestSeq = seq.clone();
			}
			return;
		}
		for (Item item : items) {
			if (!item.used && remainWeight - item.w <= item.s) {
				item.used = true;
				seq[depth] = item;
				dfs(depth + 1, curG + item.w * (depth+1), remainWeight - item.w);
				item.used = false;
				seq[depth] = null;
			}
		}
	}
	
	Item[] items;
	int bestG;
	Item[] bestSeq;
	Item[] seq;
	
	class Item {
		String name;
		int w;
		int s;
		boolean used;
	}
}