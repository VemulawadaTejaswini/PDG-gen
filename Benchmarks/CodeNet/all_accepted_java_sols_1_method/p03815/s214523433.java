import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long in = sc.nextLong();
		long ans = in / 11 * 2;
		long mod = in % 11;
		
		if (mod != 0) ans += (mod <= 6) ? 1 : 2;
		
		System.out.println(ans);		
	}
}
