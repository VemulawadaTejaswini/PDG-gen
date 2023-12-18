import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int t = sc.nextInt();
		int max = 0;
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			if (max < a) {
				max = a;
			}
		}
		System.out.println(Math.max(max - (k - max) - 1, 0));
	}
}
