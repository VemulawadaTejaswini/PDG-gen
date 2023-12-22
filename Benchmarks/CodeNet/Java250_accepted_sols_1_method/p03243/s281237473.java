import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		if (N.charAt(0) >= N.charAt(1) && N.charAt(0) >= N.charAt(2)) {
			for (int i = 0; i < 3; i++) {
				System.out.print(N.charAt(0));
			}
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.print(Character.getNumericValue(N.charAt(0)) + 1);
			}
		}
	}
}
