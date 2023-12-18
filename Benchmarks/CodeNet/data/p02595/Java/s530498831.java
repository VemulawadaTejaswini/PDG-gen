import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			Point p = new Point(x, y);
			if (p.distance(0, 0) <= d)
				cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}
