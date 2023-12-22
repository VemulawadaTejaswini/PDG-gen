import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] a = sc.next().toCharArray();
		sc.close();

		if (Character.isUpperCase(a[0])) {
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}
