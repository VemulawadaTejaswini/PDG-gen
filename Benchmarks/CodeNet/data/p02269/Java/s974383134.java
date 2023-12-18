import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> dic = new HashSet<String>();
		
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String oppe = in.next();
			String str = in.next();
			if (oppe.equals("insert")) {
				dic.add(str);
			} else {
				if (dic.contains(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}

