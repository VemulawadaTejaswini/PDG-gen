import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int num = S.length();
		sc.close();

		for (int i = 0; i < num; i++) {
			System.out.print("x");
		}
	}

}
