import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p;
		while ((p = in.nextInt()) > 0) {
			for (int i = 0; i < 9; i++) {
				p -= in.nextInt();
			}
			System.out.println(p);
		}
	}
}