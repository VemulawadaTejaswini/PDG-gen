import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		TreeMap<String, Integer> map = new TreeMap<>();

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();

			switch(query) {
			case 0:  //insert
				String key = sc.next();
				int x = sc.nextInt();
				map.put(key, x);
				break;

			case 1:  //get
				key = sc.next();
				System.out.println(map.getOrDefault(key, 0));
				break;

			case 2:  //delete
				key = sc.next();
				map.remove(key);
				break;

			case 3:  //dump
				String first = sc.next();
				String last = sc.next();
				map.subMap(first, true, last, true).forEach((color, value) ->
					System.out.println(color + " " + value));
			}
		}
	}

}

