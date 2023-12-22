import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int k = stdIn.nextInt();
		String s = stdIn.next();

		int len = s.length();
		System.out.println(len <= k ? s : s.substring(0,k) + "...");

		stdIn.close();
	}
}
