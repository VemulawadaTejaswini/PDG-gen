import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	static final int INF = 2000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}

			TreeMap<Integer, LinkedList<Point>> map = new TreeMap<Integer, LinkedList<Point>>();
			
			Point start = null, goal = null;
			int max = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					String s = sc.next();
					if(s.equals("S")){
						start = new Point(0, i, j);
						LinkedList<Point> temp = new LinkedList<Point>();
						temp.add(start);
						map.put(0, temp);
					}else if(s.equals("G")){
						goal = new Point(INF, i, j);
					}else if(s.matches("[0-9]+")){
						int num = Integer.parseInt(s);
						max = max < num ? num : max;
						if(map.containsKey(num)){
							map.get(num).add(new Point(INF, i, j));
						}else{
							LinkedList<Point> temp = new LinkedList<Point>();
							temp.add(new Point(INF, i, j));
							map.put(num, temp);
						}
					}
				}
			}
			LinkedList<Point> temp = new LinkedList<Point>();
			temp.add(goal);
			map.put(max + 1, temp);
			System.out.println(fm(map));
			System.gc();
		}
		sc.close();
	}
	static int fm(TreeMap<Integer, LinkedList<Point>> map){
		int m = 1;
		LinkedList<Point> from = map.get(0);
		LinkedList<Point> to = null;
		while(true){
			if(!map.containsKey(m)){
				break;
			}
			to = map.get(m);
//			System.out.print(m+":");
			for(Point p : to){
				for(Point s : from){
					int temp = Math.abs(p.x - s.x) + Math.abs(p.y - s.y);
					p.c = p.c > temp + s.c ? temp + s.c : p.c;
				}
//				System.out.print("[" + p.c + "]");
			}
//			System.out.println();
			from = to;
			m++;
		}		
		return map.get(m - 1).get(0).c;
	}
}
class Point{
	int c;
	int x;
	int y;
	Point(int c, int y, int x){
		this.c = c;
		this.x = x;
		this.y = y;
	}
}