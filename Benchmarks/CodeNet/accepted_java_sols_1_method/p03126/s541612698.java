import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		HashMap map = new HashMap<Integer, Integer>();
		for (int i=0; i<n; i++) {
			int foods = scan.nextInt();
			for (int j=0; j<foods; j++) {
				int food = scan.nextInt();
				if (map.containsKey(food)) {
						int suki = (int) map.get(food);
					map.put(food, ++suki);
				} else {
					map.put(food, 1);
				}
			}
		}

		int count = 0;
		for(Iterator it = map.keySet().iterator(); it.hasNext(); ) {
		    int key = (int) it.next();
		    int value = (int) map.get(key);

		    if (n == value) count++;
		}

		System.out.println(count);
	}
}