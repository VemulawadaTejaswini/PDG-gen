import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		boolean open = false;
		int n = sc.nextInt();
		Set<String> key = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			key.add(sc.next());
		}
		int m = sc.nextInt();
		// 開錠された時は、"Opened by "の後に続けてIDを、
		//
		// 施錠された時は、"Closed by "の後に続けてIDを、
		//
		// IDが登録されていないものだった場合は"Unknown "の後に続けてIDを それぞれ1行に出力せよ。
		for (int i = 0; i < m; i++) {
			String str = sc.next();
			if (key.contains(str)) {
				if (open) {
					System.out.println("Closed by " + str);
				} else {
					System.out.println("Opened by " + str);
				}
				open = !open;
			} else {
				System.out.println("Unknown " + str);
			}
		}
	}
}