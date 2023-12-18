import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = 1;
		if (x >= y) {
			while(z != 0) {
				z = x % y;
				x = y;
				y = z;
			}
			System.out.println(x);
		}
		else {
			while(z != 0) {
				z = y % x;
				y = x;
				x = z;
			}
			System.out.println(y);
		}
	}
}
