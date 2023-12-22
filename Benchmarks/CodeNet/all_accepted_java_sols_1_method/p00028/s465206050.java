import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int num = sc.nextInt();

				if (!map.containsKey(num)) {
					map.put(num, 0);
				}
				map.put(num, map.get(num) + 1);
			}
			List<Integer> list =new ArrayList<Integer>();
			int value = 0;
			for(Map.Entry<Integer, Integer> entry: map.entrySet()){
				if(value<entry.getValue()){
					value=entry.getValue();
					list.removeAll(list);
					list.add(entry.getKey());
				}
				else if(value==entry.getValue()){
					list.add(entry.getKey());
				}
			}
			for(int x:list){
				System.out.println(x);
			}

		} finally {
			sc.close();
		}
	}
}