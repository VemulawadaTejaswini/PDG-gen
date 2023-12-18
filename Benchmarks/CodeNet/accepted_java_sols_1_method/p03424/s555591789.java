
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = false;
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.equals("Y")) {
				ans = true;
				break;
			}
		}
		if(ans) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}
	}

}
