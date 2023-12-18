import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d;
		if (a > b) {
			d = a - (b + w);
		} else {
			d = b - (a + w);
		}
		if (d < 0) {
			d = 0;
		}
		System.out.println(d);
	}
}
