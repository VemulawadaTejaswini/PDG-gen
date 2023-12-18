import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		String pass = sc.next();
		boolean judge[] = new boolean[4];
		if (pass.length() > 5) {
			judge[0] = true;
		}
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				judge[1] = true;
			}
			if (Character.isUpperCase(pass.charAt(i))) {
				judge[2] = true;
			}
			if (Character.isLowerCase(pass.charAt(i))) {
				judge[3] = true;
			}
		}
		System.out.println(judge[0] && judge[1] && judge[2] && judge[3] ? "VALID"
						: "INVALID");
	}

	public static void main(String[] args) {
		new Main().run();
	}

}