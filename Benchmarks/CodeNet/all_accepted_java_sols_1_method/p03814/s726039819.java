import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String str = sc.next();
		int s = 0, e = 0, ans = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("A")) {
				s = i;
				break;
			}
		}
		
		for (int i = str.length(); i > 0; i--) {
			if (str.substring(i - 1, i).equals("Z")) {
				e = i;
				break;
			}
		}
		
		ans = e - s;
		
		
		System.out.println(ans);

		sc.close();
	}
}
