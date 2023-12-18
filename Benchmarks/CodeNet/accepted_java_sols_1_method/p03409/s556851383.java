import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stdin = new Scanner(System.in);

		int num = stdin.nextInt();

		Point[] redArray = new Point[num];
		for (int i = 0; i < num; i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			redArray[i] = new Point(x, y);
		}
		// Yの降順にソート
		Arrays.sort(redArray, (pt1, pt2) -> (pt2.y - pt1.y));

		Point[] blueArray = new Point[num];
		for (int i = 0; i < num; i++) {
			int x = stdin.nextInt();
			int y = stdin.nextInt();
			blueArray[i] = new Point(x, y);
		}
		// Xの昇順にソート
		Arrays.sort(blueArray, (pt1, pt2) -> (pt1.x - pt2.x));

		int count = 0;
		for (int i = 0; i < num; i++) {
			Point blue = blueArray[i];
			for (int j = 0; j < num; j++) {
				if (redArray[j] == null) {
					continue;
				}

				Point red = redArray[j];
				if ((red.x < blue.x) && (red.y < blue.y)) {
					redArray[j] = null;
					count++;

					break;
				}
			}
		}

		System.out.println(count);
	}

}
