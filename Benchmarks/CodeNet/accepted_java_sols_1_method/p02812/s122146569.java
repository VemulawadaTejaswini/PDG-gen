
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int state = 0;
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if(c == 'A') {
				state = 1;
			} else if(c == 'B' && state == 1) {
				state = 2;
			} else if(c == 'C' && state == 2) {
				ans++;
				state = 0;
			} else {
				state = 0;
			}
		}
		System.out.println(ans);

	}

}
