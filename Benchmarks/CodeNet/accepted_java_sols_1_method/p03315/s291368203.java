import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		String s = sc.next();
		for (int i = 0; i < 4; i++) {
			char c = s.charAt(i);
			if (c == '+') {
				num++;
			} else if (c == '-') {
				num--;
			}

		}
		System.out.println(num);

	}

}
