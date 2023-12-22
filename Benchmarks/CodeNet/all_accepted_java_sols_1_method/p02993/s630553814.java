import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char pn = n.charAt(0);
		boolean flag = false;
		for (int i = 1; i < 4; i++) {
			if (pn == n.charAt(i)) {
				flag = true;
				break;
			}
			pn = n.charAt(i);
		}
		if (flag) {
			System.out.println("Bad");
		} else {
			System.out.println("Good");
		}
	}
}
