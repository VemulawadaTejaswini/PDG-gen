import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i;
		String str, str1;
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		n = sc.nextInt();
		for (i = 0; i < n; ++i) {
			str = sc.next();
			if (str.equals("insert")) {
				str1 = sc.next();
				hs.add(str1);
			}
			if (str.equals("find")) {
				str1 = sc.next();
				if (hs.contains(str1)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		sc.close();
	}

}

