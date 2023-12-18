import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int stack[] = new int[1000];

		Scanner scanner = new Scanner(System.in);
		int counta = 0;
		while (scanner.hasNext()) {
			String sc = scanner.next();
			System.out.println(sc);
			if (sc.charAt(0) == '*') {
				stack[counta - 2] = stack[counta - 2] * stack[counta - 1];
				counta = counta - 2;
			} else if (sc.charAt(0) == '+') {
				stack[counta - 2] = stack[counta - 2] + stack[counta - 1];
				counta = counta - 2;

			} else if (sc.charAt(0) == '-') {
				stack[counta - 2] = stack[counta - 2] - stack[counta - 1];
				counta = counta - 2;

			} else {
				stack[counta] = Integer.parseInt(sc);
				counta++;
			}
		}
		System.out.println(stack[counta]);
	}
