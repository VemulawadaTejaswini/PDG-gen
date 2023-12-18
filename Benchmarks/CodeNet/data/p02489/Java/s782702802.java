import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x = 1, i = 0;
		while((x = scanner.nextInt()) != 0) {
			System.out.println("Case " + i++ + ": " + x);
		}
		scanner.close();
	}
}