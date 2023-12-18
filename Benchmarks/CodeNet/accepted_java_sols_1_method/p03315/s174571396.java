

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		String str = scanner.next();
		int ans = 0;
		
		for (int i = 0; i < 4; i++) {
			if (str.charAt(i) == '+') {
				ans++;
			}else {
				ans--;
			}
		}
		System.out.println(ans);
		scanner.close();
		

	}

}
