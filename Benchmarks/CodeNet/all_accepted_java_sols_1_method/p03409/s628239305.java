import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Point[] red = new Point[N];
		for (int i = 0; i < N; i++)
			red[i] = new Point(sc.nextInt(), sc.nextInt());
		Point[] blue = new Point[N];
		for (int i = 0; i < N; i++)
			blue[i] = new Point(sc.nextInt(), sc.nextInt());
		sc.close();

		Arrays.sort(red, (pt1, pt2) -> (pt2.y - pt1.y));
		Arrays.sort(blue, (pt1, pt2) -> (pt1.x - pt2.x));

		int ans = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (red[j] == null)
					continue;
				if (red[j].x < blue[i].x && red[j].y < blue[i].y) {
					red[j] = null;
					ans++;
					break;
				}
			}
		}

		System.out.println(ans);
	}
}