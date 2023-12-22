
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "APPROVED";
		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			if (t % 2 == 0) {
				if (t % 3 != 0 && t % 5 != 0) {
					ans = "DENIED";
					break;
				}
			}
		}
		
		System.out.println(ans);
	}
}


