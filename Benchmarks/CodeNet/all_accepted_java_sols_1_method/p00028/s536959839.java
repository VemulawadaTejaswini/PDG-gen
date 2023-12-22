import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		int max = 0;
		while(scan.hasNext()) {
			Integer num = scan.nextInt();
			int count = 0;
			if(treeMap.containsKey(num)) {
				count = treeMap.get(num);
				if(max < count + 1) {
					max = count + 1;
				}
			}
			treeMap.put(num, count + 1);
		}
		for(Integer key : treeMap.keySet()) {
			if(treeMap.get(key) == max) {
				System.out.println(key);
			}
		}
		scan.close();
	}
}
