
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] list = S.split("");

		if (list[0].equals(list[1]) && list[1].equals(list[2])) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}