import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		
		x -= z;

		while (x >= y + z) {
			x -= (y + z);
			a++;
		}
		
		System.out.println(a);

		sc.close();
	}
}