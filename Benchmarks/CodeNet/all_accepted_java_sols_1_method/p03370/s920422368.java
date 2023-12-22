import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] m = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			m[i] = scan.nextInt();
			x = x - m[i];
		}
		Arrays.sort(m);
		x = x / m[0];
		System.out.println(x + n);
	}
}