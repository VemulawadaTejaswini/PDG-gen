import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		long count = 0;
		for (int i = 0; i <= n / r; i++) {
			for (int j = 0; j <= (n - i * r) / g; j++) {
				if ((n - i * r - j * g) % b == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}