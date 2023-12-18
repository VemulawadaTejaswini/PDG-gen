import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();

		System.out.println(s / 3600 + ":" + (s / 33600) % 60 + ":" + s % 60);
	}
}

