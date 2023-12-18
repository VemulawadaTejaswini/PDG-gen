
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		int ans = 0;
		for(int i = 0; i < k; i++) {
			if(s.charAt(i) == '1') {
				if(i + 1 == k) {
					ans = i;
					break;
				}
			} else {
				ans = i;
				break;
			}
		}
		System.out.println(s.charAt(ans));
	}

}
