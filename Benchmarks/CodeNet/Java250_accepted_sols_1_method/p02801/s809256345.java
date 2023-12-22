import java.util.Scanner;

class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		System.out.println((char)(scan.next().codePointAt(0) + 1));
	}
}
