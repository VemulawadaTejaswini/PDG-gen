import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int S = scan.nextInt();
		int h = S/60/60;
		int m = S/60 - h*60;
		int s = S % 60;

		System.out.println(String.format("%d:%d:%d", h, m, s));
	}
}

