import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		Map<String, Integer> appear_num = new HashMap<String, Integer>();
		for (int i = 0; i < w.length(); i++) {
			if(!appear_num.containsKey(w.substring(i,i+1))) {
				appear_num.put(w.substring(i,i+1), 1);
			}
			else {
				appear_num.put(w.substring(i,i+1),
						appear_num.get(w.substring(i,i+1))+1);
			}
		}

		for(Map.Entry<String,Integer> entry : appear_num.entrySet()) {
			if(entry.getValue() % 2 !=0) {
				System.out.println("No");
				System.exit(0);
			}
		}

		System.out.println("Yes");
	    scanner.close();
		}
}
