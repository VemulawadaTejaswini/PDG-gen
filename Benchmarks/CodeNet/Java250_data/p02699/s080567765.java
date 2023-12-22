import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int w = scan.nextInt();
		scan.close();

		String message = w >= s ? "unsafe" : "safe";
		System.out.println(message);
	}

}