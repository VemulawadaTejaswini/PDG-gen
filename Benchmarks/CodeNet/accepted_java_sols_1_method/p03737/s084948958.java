import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i ++) {
			String s = sc.next();
			System.out.print(s.substring(0, 1).toUpperCase());
		}
	}
}
