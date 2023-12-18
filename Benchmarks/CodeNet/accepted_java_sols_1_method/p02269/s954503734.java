import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();

		Set<String> set = new HashSet<String>();

		for(int i = 0; i < n; i++) {
			String order = sc.next();
			String str = sc.next();

			if(order.equals("insert")) {
				set.add(str);
			} else {
				System.out.println(set.contains(str) ? "yes" : "no");
			}
		}
	}
}
