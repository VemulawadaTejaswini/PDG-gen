import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		String answer = "";

		if (0 <= b && b <= a) {
			answer = "delicious";
		} else if (a < b && b <= a + x) {
			answer = "safe";
		} else if (a + x < b) {
			answer = "dangerous";
		}
		System.out.println(answer);
	}

}
