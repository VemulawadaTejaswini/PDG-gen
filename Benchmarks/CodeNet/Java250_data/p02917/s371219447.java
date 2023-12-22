import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] b;
	static long result = 0L;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		b = new int[n - 1];
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		result += b[0];
		result += b[b.length - 1];
		for (int i = 0; i < b.length - 1; i++) {
			result += Math.min(b[i], b[i + 1]);
		}
		System.out.println(result);
	}
}
