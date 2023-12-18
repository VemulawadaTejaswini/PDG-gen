
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String out;
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		if (a == b) {
			out = "a == b";
		} else if (a < b) {
			out = "a < b";
		} else if (a > b) {
			out = "a > b";
		} else {
			out = "Error";
		}
		System.out.println(out);
	}

}