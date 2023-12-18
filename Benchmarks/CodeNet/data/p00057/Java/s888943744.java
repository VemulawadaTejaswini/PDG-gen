import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println((n * n + n + 2) / 2);
		}
	}
}