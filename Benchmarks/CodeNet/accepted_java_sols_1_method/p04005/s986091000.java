import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long[] n = {a, b, c};
		Arrays.sort(n);
		if(a%2==0||b%2==0||c%2==0) {
			System.out.println(0);
			return;
		}
		//System.out.println(Arrays.toString(n));
		System.out.println(n[0]*n[1]);
	}
}
