import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int i = 1;
		while (a != 0) {
			System.out.printf("Case " + i + ": %d\n", a);
			a = scan.nextInt();
			i = i + 1;
		}
	}
}