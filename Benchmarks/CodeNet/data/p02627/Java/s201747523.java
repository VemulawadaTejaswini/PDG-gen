import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		sc.close();

		if ('A' <= s && s <= 'Z') {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}
