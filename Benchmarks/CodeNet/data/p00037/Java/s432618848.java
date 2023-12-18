import java.awt.Point;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
 enum Vec {
	R,
	U,
	L,
	D;
	Vec next() {
	 return (this == R) ? D : (this == D) ? L
		 : (this == L) ? U : R;
	}
 }

 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	boolean isKisu = true;
	List<boolean[]> gusu = new ArrayList<boolean[]>();
	List<boolean[]> kisu = new ArrayList<boolean[]>();
	while (in.hasNextLine()) {

	 isKisu = !isKisu;
	 char[] str = in.nextLine().toCharArray();
	 boolean[] bs = new boolean[str.length];
	 for (int i = 0; i < bs.length; i++) {
		bs[i] = (str[i] == '1');
	 }
	 ((isKisu) ? kisu : gusu).add(bs);
	}
	Map<Point, Map<Vec, Point>> map = new HashMap<Point, Map<Vec, Point>>();
	int ySize = gusu.size();
	int xSize = kisu.get(0).length;
	for (int y = 0; y < ySize; y++) {
	 for (int x = 0; x < xSize; x++) {
		map.put(
		  new Point(x, y),
		  new EnumMap<Vec, Point>(Vec.class));
	 }
	}
	{
	 int size = gusu.size();
	 for (int y = 0; y < size; y++) {
		int length = gusu.get(y).length;
		for (int x = 0; x < length; x++) {
		 if (gusu.get(y)[x]) {
			Point o = new Point(x, y);
			Point r = new Point(x + 1, y);
			map.get(o).put(Vec.R, r);
			map.get(r).put(Vec.L, o);
		 }
		}
	 }
	}
	{
	 int size = kisu.size();
	 for (int y = 0; y < size; y++) {
		int length = kisu.get(y).length;
		for (int x = 0; x < length; x++) {
		 if (kisu.get(y)[x]) {
			Point o = new Point(x, y);
			Point d = new Point(x, y + 1);
			map.get(o).put(Vec.D, d);
			map.get(d).put(Vec.U, o);
		 }
		}
	 }
	}
	Vec next = Vec.R;
	Point posi = new Point(0, 0);
	do {
	 next = next.next().next().next();
	 Map<Vec, Point> point = map.get(posi);
	 while (!point.containsKey(next)) {
		next = next.next();
	 }
	 System.out.print(next);
	 posi = point.get(next);
	} while (posi.x != 0 || posi.y != 0);
 }
}