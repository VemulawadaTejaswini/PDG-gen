import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int inM = stdin.nextInt();
		System.out.println(48 - inM);
	}
}
