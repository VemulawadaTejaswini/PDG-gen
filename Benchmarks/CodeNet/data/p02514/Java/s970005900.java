import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int H, W;
	static ArrayList<ArrayList<Point>> crystal;

	public static void main(String[] args) throws Exception {
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0 && W == 0) return;
			crystal = new ArrayList<ArrayList<Point>>(3000);
			for (int i = 0; i < 3000; ++i) {
				crystal.add(new ArrayList<Point>());
			}
			Point gp = null;
			int maxOrd = 0;
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					String tile = sc.next();
					if (tile.equals("S")) {
						crystal.get(0).add(new Point(i, j));
					} else if (tile.equals("G")) {
						gp = new Point(i, j);
					} else if (!tile.equals(".")) {
						int order = Integer.parseInt(tile);
						crystal.get(order).add(new Point(i, j));
						maxOrd = Math.max(maxOrd, order);
					}
				}
			}
			crystal.get(maxOrd + 1).add(gp);
			ArrayList<Integer> len = new ArrayList<Integer>();
			len.add(0);
			for (int ord = 1; ord <= maxOrd + 1; ++ord) {
				ArrayList<Integer> next = new ArrayList<Integer>();
				for (int i = 0; i < crystal.get(ord).size(); ++i) {
					Point destPos = crystal.get(ord).get(i);
					int minDist = Integer.MAX_VALUE;
					for (int j = 0; j < len.size(); ++j) {
						Point srcPos = crystal.get(ord - 1).get(j);
						int dist = len.get(j) + Math.abs(destPos.x - srcPos.x) + Math.abs(destPos.y - srcPos.y);
						minDist = Math.min(minDist, dist);
					}
					next.add(minDist);
				}
				len = next;
			}
			System.out.println(len.get(0));
		}
	}
}