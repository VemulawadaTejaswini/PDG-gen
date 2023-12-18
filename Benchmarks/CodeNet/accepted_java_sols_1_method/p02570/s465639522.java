import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int d = sc.nextInt();
			int t = sc.nextInt();
			int s = sc.nextInt();
			if (d > t * s) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}