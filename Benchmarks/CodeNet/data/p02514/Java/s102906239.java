import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            if (w == 0 && h == 0) {
                break;
            }
            SortedMap<Integer, List<Point>> jewels = new TreeMap<Integer, List<Point>>();
            Point start = null;
            //Point goal = null;

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    String s = sc.next();
                    if (Character.isDigit(s.charAt(0))
                            && (s.length() == 1 || Character.isDigit(s.charAt(1)))) {
                        Integer i = Integer.valueOf(s);
                        List<Point> l = jewels.get(i);
                        if(l == null) {
                            jewels.put(i, l = new ArrayList<Point>());
                        }
                        l.add(new Point(x, y));
                    }
                    else if (s.equals("S")) {
                        start = new Point(x, y);
                    }
                    else if (s.equals("G")) {
                        List<Point> l = new ArrayList<Point>();
                        jewels.put(Integer.valueOf(2501), l);
                        l.add(new Point(x, y));
                    }
                }
            }
            
            @SuppressWarnings("unchecked")
            List<Point>[] jewelsArr = new List[jewels.size()];
            int ii = 0;
            for (List<Point> l : jewels.values()) {
                jewelsArr[ii++] = l;
            }
            
            boolean[][] visited = new boolean[w][h]; // é_ÉÍóìÍ1Â
            class State implements Comparable<State> {
                final int i;
                final Point p;
                final int dist;

                public State(int i, Point p, int dist) {
                    super();
                    this.i = i;
                    this.p = p;
                    this.dist = dist;
                }

                @Override
                public int compareTo(State o) {
                    return o.dist - dist;
                }
            }
            PriorityQueue<State> pq = new PriorityQueue<State>(w, Collections.reverseOrder());
            pq.add(new State(-1, start, 0));
            
            
            while (!pq.isEmpty()) {
                State state = pq.poll();
                if (state.i + 1 >= jewelsArr.length) {
                    System.out.println(state.dist);
                    break;
                }
                if (visited[state.p.x][state.p.y]) {
                    continue;
                }
                visited[state.p.x][state.p.y] = true;
                for (Point point : jewelsArr[state.i + 1]) {
                    
                    if (!visited[point.x][point.y]) {
                        int xDiff = Math.abs(state.p.x - point.x);
                        int yDiff = Math.abs(state.p.y - point.y);
                        pq.add(new State(state.i + 1, point, state.dist + xDiff + yDiff));
                    }
                }
            }
        }

    }

}