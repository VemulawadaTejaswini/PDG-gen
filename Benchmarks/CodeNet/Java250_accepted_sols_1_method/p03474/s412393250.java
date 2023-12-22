import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int A = reader.nextInt();
		int B = reader.nextInt();
		String str = reader.next();
		String ans = "Yes";
		for (int i = 0; i < A; i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				ans = "No";
			}
		}
		if (str.charAt(A) != '-') {
			ans = "No";
		}
		for (int i = A+1; i <= B + A; i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				ans = "No";
			}
		}
		System.out.print(ans);
		reader.close();
	}
}



