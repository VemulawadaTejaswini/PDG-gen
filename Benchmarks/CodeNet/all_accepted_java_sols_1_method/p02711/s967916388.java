import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			if (n.charAt(i) == '7') {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
