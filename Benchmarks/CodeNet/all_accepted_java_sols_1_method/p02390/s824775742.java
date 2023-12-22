import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int S = in.nextInt();
		int h = S / 60 / 60;
		int m = (S / 60) % 60;
		int s = S % 60;

		System.out.println(String.format("%d:%d:%d", h, m, s));
	}
}