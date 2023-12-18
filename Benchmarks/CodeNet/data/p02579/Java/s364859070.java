import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int H;
    int W;
    Point start;
    int goalH;
    int goalW;
    boolean[][] maze;
    boolean[][] visited;
    Queue<Point> queue;
    Queue<Point> frontArea;
    int warp;
    int result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        start = new Point(sc.nextInt(), sc.nextInt());
        queue = new ArrayDeque<>();
        queue.add(start);
        frontArea = new ArrayDeque<>();
        goalH = sc.nextInt();
        goalW = sc.nextInt();        
        maze = new boolean[W][H];
        visited = new boolean[W][H];
        for (int i=0; i<H; i++) {
            char[] line = sc.next().toCharArray();
            for (int j=0; j<W; j++) {
                maze[j][i] = ('.' == line[j]);
            }
        }
        visited[start.x-1][start.y-1] = true;
        warp = 0;
        result = -1;
    }

    private void solve() {
        if (start.x == goalW && start.y == goalH) { result = warp; return; }
        for (; ; ) {
            if (result > -1) { return; }
            if (queue.size() < 1) {
                warp();
                if (visited[goalW-1][goalH-1]) {
                    return;
                }
                if (queue.size() > 0) {
                    continue;
                } else {
                    return;
                }
            }
            Point point = queue.poll();
            frontArea.add(point);
            // System.out.println("poll:" + point.x + "," + point.y);
            // System.out.println("queue.size()=" + queue.size());
            // up
            if (point.y - 1 > 0) { visit(point.x, point.y - 1); }
            // down
            if (point.y + 1 < H+1) { visit(point.x, point.y + 1); }
            // left
            if (point.x - 1 > 0) { visit(point.x - 1, point.y); }
            // right
            if (point.x + 1 < W+1) { visit(point.x + 1, point.y); }
        }
    }

    private void warp() { 
        warp++;
        while (frontArea.size() > 0){
            if (result > -1) { return; }
            Point point = frontArea.poll();
            int x = point.x;
            int y = point.y;
            if (maze[x-1][y-1]) {
                if (y - 2 > 0) {
                    if (x - 2 > 0) { visit(x - 2, y - 2); }
                    if (x - 1 > 0) { visit(x - 1, y - 2); }
                    { visit(x, y - 2); }
                    if (x + 1 < W+1) { visit(x + 1, y - 2); }
                    if (x + 2 < W+1) { visit(x + 2, y - 2); }
                }
                if (y - 1 > 0) {
                    if (x - 2 > 0) { visit(x - 2, y - 1); }
                    if (x - 1 > 0) { visit(x - 1, y - 1); }
                    if (x + 1 < W+1) { visit(x + 1, y - 1); }
                    if (x + 2 < W+1) { visit(x + 2, y - 1); }
                }
                {
                    if (x - 2 > 0) { visit(x - 2, y); }
                    if (x + 2 < W+1) { visit(x + 2, y); }
                }
                if (y + 1 < H+1) {
                    if (x - 2 > 0) { visit(x - 2, y + 1); }
                    if (x - 1 > 0) { visit(x - 1, y + 1); }
                    if (x + 1 < W+1) { visit(x + 1, y + 1); }
                    if (x + 2 < W+1) { visit(x + 2, y + 1); }
                }
                if (y + 2 < H+1) {
                    if (x - 2 > 0) { visit(x - 2, y + 2); }
                    if (x - 1 > 0) { visit(x - 1, y + 2); }
                    { visit(x, y + 2); }
                    if (x + 1 < W+1) { visit(x + 1, y + 2); }
                    if (x + 2 < W+1) { visit(x + 2, y + 2); }
                }
            }
        }
    }

    private void visit(int x, int y) {
        if (!visited[x-1][y-1]) {
            visited[x-1][y-1] = true;
            if (maze[x-1][y-1]) {
                if (goalH == y && goalW == x) {
                    result = warp;
                    return;
                }
                queue.add(new Point(y, x));
                // System.out.println("add:" + x + "," + y);
                // System.out.println("queue.size()=" + queue.size());
            }
        }
    }

    private void output() {
        System.out.println(result);
    }
}

class Point {
    public int y;
    public int x;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }
}