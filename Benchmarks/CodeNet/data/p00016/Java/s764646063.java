import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\D");
		int a, b;
		double x, y;
		int ax = 0, by = 0;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 & b == 0) break;
			x = Math.cos((Math.PI * b) / 180) * a;
			y = Math.sin((Math.PI * b) / 180) * a;
			ax += x;
			by += y;
		}
		System.out.printf("%d\n%d",ax,by);
	}
}