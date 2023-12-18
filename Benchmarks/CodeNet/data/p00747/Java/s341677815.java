import java.awt.Point;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<Integer> ans = new LinkedList<Integer>();
		while (true) {
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			if (width == 0 && height == 0)
				break;
			ArrayList<ArrayList<Boolean> > r_walls = new ArrayList<ArrayList<Boolean> >(height);
			ArrayList<ArrayList<Boolean> > b_walls = new ArrayList<ArrayList<Boolean> >(height);
			for (int j = 0; j < height; j++) {
				ArrayList<Boolean> r_wall = new ArrayList<Boolean>(width - 1);
				for (int i = 0; i < width - 1; i++) {
					r_wall.add((scanner.nextInt() == 0) ? false : true);
				}
				r_walls.add(r_wall);
				if(j == height - 1)
					break;
				ArrayList<Boolean> b_wall = new ArrayList<Boolean>(width);
				for (int i = 0; i < width; i++) {
					b_wall.add((scanner.nextInt() == 0) ? false : true);
				}
				b_walls.add(b_wall);
			}
			//System.out.println("unko");
			Deque<LinkedList<Point> > deque = new LinkedList<LinkedList<Point> >();
			LinkedList<Point> init = new LinkedList<Point>();
			init.add(new Point(0, 0));
			deque.offer(init);
			while (true) {
				if(deque.isEmpty()) {
					ans.add(0);
					break;
				}
				LinkedList<Point> tmp = deque.poll();
				Point last = tmp.peekLast();
				if(last.equals(new Point(width - 1, height - 1))) {
					//System.out.println(tmp);
					ans.add(tmp.size());
					break;
				}
				// 右
				if(last.x < width - 1 && r_walls.get(last.y).get(last.x) == false)  {
					Point next = new Point(last.x + 1, last.y);
					if(!tmp.contains(next)) {
						LinkedList<Point> nw = new LinkedList<Point>(tmp);
						nw.add(next);
						deque.offer(nw);
					}
				}
				// 左
				if(last.x > 0 && r_walls.get(last.y).get(last.x - 1) == false) {
					Point next = new Point(last.x - 1, last.y);
					if(!tmp.contains(next)) {
						LinkedList<Point> nw = new LinkedList<Point>(tmp);
						nw.add(next);
						deque.offer(nw);
					}
				}
				// 下
				if(last.y < height - 1 && b_walls.get(last.y).get(last.x) == false) {
					Point next = new Point(last.x, last.y + 1);
					if(!tmp.contains(next)) {
						LinkedList<Point> nw = new LinkedList<Point>(tmp);
						nw.add(next);
						deque.offer(nw);
					}
				}
				// 上
				if(last.y > 0 && b_walls.get(last.y - 1).get(last.x) == false) {
					Point next = new Point(last.x, last.y - 1);
					if(!tmp.contains(next)) {
						LinkedList<Point> nw = new LinkedList<Point>(tmp);
						nw.add(next);
						deque.offer(nw);
					}
				}
			}
		}
		for(Iterator<Integer> it = ans.iterator(); it.hasNext();)
			System.out.println(it.next());
	}

}