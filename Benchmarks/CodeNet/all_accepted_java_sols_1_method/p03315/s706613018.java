import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();

		int I = 0;

		StringBuilder sb = new StringBuilder(S);
		for (int i = 0; i < 4; i ++) {
			if(sb.charAt(i) == '+') {
				I ++;
			} else if (sb.charAt(i) == '-') {
				I --;
			}
		}

		System.out.println(I);

	}

}
