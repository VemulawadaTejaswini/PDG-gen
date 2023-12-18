import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, ap, bp, n;
		
		n = scanner.nextInt();
		while(n != 0) {
			ap = bp = 0;
			for(int i = 0; i < n; i++) {
				a = scanner.nextInt();
				b = scanner.nextInt();
				if (a == b) {
					ap += a;
					bp += a;
				} else if (a > b) {
					ap += a + b;
				} else {
					bp += a + b;
				}
			}
			System.out.println(String.format("%d %d", ap, bp));
			n = scanner.nextInt();
		}
	}
}