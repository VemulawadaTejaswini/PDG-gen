import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+') {
				num++;
			} else {
				num--;
			}
		}
		System.out.println(num);
	}

}
