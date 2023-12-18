import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = 100;
		for (int i = 1; i <= 1000000; i++) {
			y = y + y /100;
			if (y >= x) {
				System.out.println(i);
				return;
			}
		}
	}
}
