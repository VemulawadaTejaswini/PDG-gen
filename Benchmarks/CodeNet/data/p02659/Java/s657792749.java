import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		double n = scn.nextDouble() * 100;
		int b = (int) n;
		long ans = (long) a * b / 100;
		System.out.println(ans);

	}
}