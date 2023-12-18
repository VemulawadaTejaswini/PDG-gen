import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt(), w = s.nextInt();
		if (h<=w) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
