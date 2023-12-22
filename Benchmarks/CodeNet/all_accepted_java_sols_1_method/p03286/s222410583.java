import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		StringBuilder ans = new StringBuilder();
		while (n != 0) {
			if (n % 2 != 0) {
				n--;
				ans.append(1);
			} else {
				ans.append(0);
			}
			n /= -2;
		}
		System.out.println(ans.length() > 0 ? ans.reverse().toString() : 0);
		in.close();
	}
}