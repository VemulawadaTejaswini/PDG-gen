import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Map<Integer, Point> map;
    public static void main(String[] args) throws Exception {
        int[] ary = {0,-1,-1,0,0,1,1,0};
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int maxx = 0;
            int maxy = 0;
            int minx = 0;
            int miny = 0;
            map = new HashMap<>();
            map.put(0, new Point(0, 0));
            for (int i = 1; i < n; i++) {
                int c = sc.nextInt();
                int d = sc.nextInt();
                Point p = map.get(c);
                map.put(i, new Point(p.x+ary[d*2], p.y+ary[d*2+1]));
            }
            
            for (int i = 0; i < n; i++) {
                Point p = map.get(i);
                maxx = Math.max(maxx, p.x);
                maxy = Math.max(maxy, p.y);
                minx = Math.min(minx, p.x);
                miny = Math.min(miny, p.y);
            }
            
            int dx = maxx-minx+1;
            int dy = maxy-miny+1;
            System.out.println(dy + " " + dx);
        }
    }
}

class Point {
    public int x;
    public int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}