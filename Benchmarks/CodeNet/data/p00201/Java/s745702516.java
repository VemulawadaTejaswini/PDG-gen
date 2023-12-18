import java.util.HashMap;
import java.util.Scanner;

public class Main {

	void run() {
		Scanner in = new Scanner(System.in);
		
		HashMap<String, Integer> item = new HashMap<String, Integer>();
		
		while(true) {
			int N = Integer.parseInt(in.next());
			if (N == 0) break;
			for(int i = 0; i < N; i++) {
				item.put(in.next(), Integer.parseInt(in.next()));
			}
			
			int M = Integer.parseInt(in.next());
			for(int i = 0; i < M; i++) {
				String item_name = in.next();
				int item_cost = item.get(item_name);
				int X = Integer.parseInt(in.next());
				int recipe_cost = 0;
				for(int j = 0; j < X; j++) {
					recipe_cost += item.get(in.next());
				}
				if(item_cost > recipe_cost) {
					item.put(item_name, recipe_cost);
				}
			}
			System.out.println(item.get(in.next()));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}