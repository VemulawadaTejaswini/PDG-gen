import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		long W = scanner.nextLong();
		long H = scanner.nextLong();
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		System.out.println(W*H/2.0);
		if(2*x == W && 2*y == H) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}