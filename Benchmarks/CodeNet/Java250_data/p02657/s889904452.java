import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println(a * b);

		}
	}
}