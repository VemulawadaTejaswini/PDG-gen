import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			char c = scan.next().charAt(0);
			System.out.print('A' <= c && c <= 'Z' ? "A" : "a");
		}
	}
}