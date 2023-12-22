import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double hourX = Math.sin((h + m / 60.0) / 6.0 * Math.PI) * a;
		double hourY = Math.cos((h + m / 60.0) / 6.0 * Math.PI) * a;
		double minX = Math.sin(m / 30.0 * Math.PI) * b;
		double minY = Math.cos(m / 30.0 * Math.PI) * b;
		double ans = Math.sqrt((hourX - minX) * (hourX - minX) + (hourY - minY) * (hourY - minY));
		System.out.println(ans);
	}
}
 