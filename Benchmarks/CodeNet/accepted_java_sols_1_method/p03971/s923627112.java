import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String input = sc.next();
		String[] inputS = input.split("");
		for (String string : inputS) {
			if (string.equals("a")) {
				if (A + B > 0) {
					A--;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				continue;
			}
			if (string.equals("b")) {
				if (A + B > 0 && B > 0) {
					B--;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
				continue;
			}
			System.out.println("No");
		}
	}
}
