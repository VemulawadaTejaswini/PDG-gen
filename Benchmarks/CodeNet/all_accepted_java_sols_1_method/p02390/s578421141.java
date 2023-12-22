
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();

		//
		int s = S % 60;
		int M = S / 60;
		int m = M % 60;
		int H = M / 60;
		int h = H;

		// ret
		System.out.println(h + ":" + m + ":" + s);
	}
}