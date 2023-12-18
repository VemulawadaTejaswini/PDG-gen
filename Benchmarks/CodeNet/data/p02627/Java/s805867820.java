import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char c = a.toCharArray()[0];
		if (c <= 90) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}