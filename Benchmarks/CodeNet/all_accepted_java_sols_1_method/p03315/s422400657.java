import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String n = sc.next();
		int ans = 0;

		for (int i = 0; i < 4; i++) {
		if (n.substring(i, i + 1).equals("+")) {
			ans++;
		} else { 
			ans--;
		}
		}
		
		System.out.println(ans);

		sc.close();
	}
}
