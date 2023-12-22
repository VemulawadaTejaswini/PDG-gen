import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i <= 10000) {
			int x = scanner.nextInt();
			i ++;
			if (x == 0) {
				break;
			} else {
				System.out.println ("Case " + i + ": " + x);
				}
		}
	}
}
