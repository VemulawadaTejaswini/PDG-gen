import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = 0;
		for(int i = 0; i < n; i++) {
			String s = scan.next();
			if(map.containsKey(s)) {
				int num = map.get(s) + 1;
				map.put(s, num);
				if(max < num) max = num;
			} else {
				map.put(s, 1);
				if(max < 1) max = 1;
			}
		}
		for(String val: map.keySet()) {
			if(map.get(val) == max)	System.out.println(val);
		}
		scan.close();
	}

}
