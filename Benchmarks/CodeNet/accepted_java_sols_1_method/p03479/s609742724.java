import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sx = scanner.next(), sy = scanner.next();
		long x = Long.parseLong(sx), y = Long.parseLong(sy);
		
		long ans = 0;
		long min = x;
		
		
		while (true) {
			if (min>y) {
				break;
			}
			ans++;
			min *= 2;
		}
		
		System.out.println(ans);
		scanner.close();
	}
}