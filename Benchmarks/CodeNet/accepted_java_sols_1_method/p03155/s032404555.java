import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		if (n - h >= 0 || n - w >= 0) {
			System.out.println((n - h + 1) * (n - w + 1));
		} else {
			System.out.println(0);
		}
	}
}
