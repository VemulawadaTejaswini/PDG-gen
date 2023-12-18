import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int count = 0;
		int x = 0;
		for (int i = b; i >= a; i --) {
			x = c % i;
			if (x == 0) {
				count = count + 1;
			}
		}
		System.out.println (count);
	}
}
