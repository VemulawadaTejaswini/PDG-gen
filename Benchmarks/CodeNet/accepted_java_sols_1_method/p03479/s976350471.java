import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long Y = scan.nextLong();
		long ans = 0;
		while (X <= Y) {
			X *= 2;
			ans++;
		}
		System.out.println(ans);
	}
}
