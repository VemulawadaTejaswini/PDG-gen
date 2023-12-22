
import java.util.HashSet;
import java.util.Scanner;

class Main {

	/*
	 * https://onlinejudge.u-aizu.ac.jp/#/problems/ALDS1_4_C
	 */

	public static void main(String[] args) {
		HashSet<String> dictionary = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		for(int i=0; i<n; i++) {
			String order = scanner.next();
			if(order.equals("find")) {
				String target = scanner.next();
				if(dictionary.contains(target)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else {
				//order == "insert"
				dictionary.add(scanner.next());
			}
		}
		scanner.close();
	}

}

