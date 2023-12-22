import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int result = 0;

		if ("+".equals(String.valueOf(S.charAt(0)))) {
			result++;
		} else {
			result--;
		}
		if ("+".equals(String.valueOf(S.charAt(1)))) {
			result++;
		} else {
			result--;
		}
		if ("+".equals(String.valueOf(S.charAt(2)))) {
			result++;
		} else {
			result--;
		}
		if ("+".equals(String.valueOf(S.charAt(3)))) {
			result++;
		} else {
			result--;
		}
		System.out.println(result);
	}

}
