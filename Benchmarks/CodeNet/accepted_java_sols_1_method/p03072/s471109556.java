import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			if (max <= h) {
				max = h;
				count++;
			}
		}
		System.out.println(count);
	}
}
