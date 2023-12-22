import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sList = S.toCharArray();
		int sum = 0;

		for (char s : sList) {
			if (s == '+') {
				sum += 1;
			} else {
				sum -= 1;
			}
		}
		System.out.println(sum);
	}
}