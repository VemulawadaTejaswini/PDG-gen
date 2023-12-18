import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x;
		int k;
		int d;

		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();
		k = scan.nextInt();
		d = scan.nextInt();

		for(int i = 1; i <= k; i++) {
			if(Math.abs(x - d) < Math.abs(x + d)) {
				x -= d;
			}else {
				x += d;
			}
		}
		System.out.println(Math.abs(x));
	}
}
