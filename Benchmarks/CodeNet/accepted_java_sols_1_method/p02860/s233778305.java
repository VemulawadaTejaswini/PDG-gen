
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();

		if(n%2 != 0) {
			System.out.println("No");
		}else {
			boolean f = true;

			for(int i = 0; i < n/2; i++) {
				if(s.charAt(i) != s.charAt(i+n/2)) {
					f = false;
				}
			}

			if(f) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}
