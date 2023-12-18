
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){
		int i, q, order;
		String key;
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				key = sc.next();
				if(order == 0) {
					tm.put(key, sc.nextInt());
				}else if(order == 1) {
					if(tm.get(key) == null) {
						System.out.println(0);
					}else {
						System.out.println(tm.get(key));
					}
				}else {
					tm.remove(key);
				}
			}
		}
	}
}

