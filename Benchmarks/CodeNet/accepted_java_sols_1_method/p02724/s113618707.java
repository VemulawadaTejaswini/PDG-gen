import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long coin = sc.nextLong();
			long happy = 0;
			happy += coin / 500 * 1000;
			happy += coin % 500 / 5 * 5;
			System.out.println(happy);
		}
	}
}