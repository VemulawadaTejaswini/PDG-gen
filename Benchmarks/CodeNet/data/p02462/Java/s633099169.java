import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		TreeMap<String, List<Integer>> map = new TreeMap<String, List<Integer>>();

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();

			switch(query) {
			case 0:  //insert
				String key = sc.next();
				int x = sc.nextInt();
				if(map.get(key) == null) {
					map.put(key, new ArrayList<Integer>());
				}
				map.get(key).add(x);
				break;

			case 1:  //get
				key = sc.next();
				if(map.get(key) != null) {
					for(int num : map.get(key)) {
						System.out.println(num);
					}
				}
				break;

			case 2:  //delete
				key = sc.next();
				if(map.get(key) != null) {
					map.remove(key);
				}
				break;

			case 3:  //dump
				String first = sc.next();
				String last = sc.next();
				//map.subMap(first, true, last , true).forEach((color, value) -> {
				for(String color : map.subMap(first, true, last, true).keySet()) {
					for(int num : map.subMap(first, true, last, true).get(color)) System.out.println(color + " " + num);
				}
			}
		}
	}

}

