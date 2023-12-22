import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		int sTotal = 0;
		for (int i = 0; i < s.length(); i++) {
			sTotal += Integer.parseInt(s.substring(i, i + 1));
		}
		if (n % sTotal == 0) {
			System.out.print("Yes");
		} else{
			System.out.print("No");
		}
	}
}
