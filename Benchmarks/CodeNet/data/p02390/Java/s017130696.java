import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		final int constant = 60;
		int second = S % constant;
		int minute = (S - second) % constant;
		int hour = S / (constant * constant);

		System.out.println(hour + ":" + minute + ":" + second);
	}
}