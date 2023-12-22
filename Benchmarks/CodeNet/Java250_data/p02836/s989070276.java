
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		int l = s.length();

		int cnt = 0;
		for(int i = 0; i < l/2-0.5; i++) {
			if(s.charAt(i) != s.charAt(l-i-1)) {
				cnt++;
			}
		}

		System.out.println(cnt);


	}
}
