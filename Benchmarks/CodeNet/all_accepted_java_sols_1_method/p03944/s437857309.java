import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int minx = 0, miny = 0;
		int maxx = w, maxy = h;
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			int a = Integer.parseInt(sc.next());
			if (a == 1)
				minx = Math.max(minx, x);
			else if (a == 2)
				maxx = Math.min(maxx, x);
			else if (a == 3)
				miny = Math.max(miny, y);
			else
				maxy = Math.min(maxy, y);
		}
		System.out.println(Math.max((maxx - minx), 0) * Math.max((maxy - miny), 0));
	}
}