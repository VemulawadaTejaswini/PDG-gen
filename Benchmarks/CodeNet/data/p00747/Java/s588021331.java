import java.util.*;

public class Main {
    Scanner sc;
    int w;
    int h;
    boolean[][] isVisited;
    void run() {
        sc = new Scanner(System.in);
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) break;
            isVisited  = new boolean[h+2][w+2];
            for (int i=1;i<h+1;i++)
                for (int j=1;j<w+1;j++) isVisited[i][j] = true;
            Wall wall = new Wall(w, h);

            Point p = new Point(1, 1);
            LinkedList<Point> l = new LinkedList<Point>();
            int count = 1;
            int pointer = 0,nextPointer = 0;
            while (!p.isGoal()) {
                isVisited[p.getY()][p.getX()] = false;
                LinkedList<Point> tmp = wall.getNextP(p);
                nextPointer += tmp.size();
                if (pointer == 0) {
                    count ++;
                    pointer = nextPointer;
                    nextPointer = 0;
                }
                l.addAll(tmp);
                if (l.isEmpty()) {
                    count = 0;
                    break;
                }
                p = l.removeFirst();
                pointer--;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

    class Wall {
        int[][] wall;

        Wall(int w,int h) {
            wall = new int[2*h+1][w+2];
            for (int i=0;i<2*h+1;i++)
                for (int j=0;j<w+2;j++) wall[i][j] = 1;
            for (int i=1;i<2*h;i++) {
                if (i%2==1) {
                    for (int j=1;j<w;j++) {
                        wall[i][j] = sc.nextInt();
                    }
                }
                else {
                    for (int j=1;j<w+1;j++) {
                        wall[i][j] = sc.nextInt();
                    }
                }
            }
        }

        int[] dxw = {-1,0,0,0};
        int[] dyw = {-1,-2,-1,0};
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        LinkedList<Point> getNextP(Point p) {
            LinkedList<Point> l = new LinkedList<Point>();
            for (int i=0;i<4;i++) {
                if (wall[2*p.getY()+dyw[i]][p.getX()+dxw[i]] == 0 && isVisited[p.getY()+dy[i]][p.getX()+dx[i]] ) {
                    Point nextP = new Point(p.getX()+dx[i],p.getY()+dy[i]);
                    l.add(nextP);
                }
            }
            return l;
        }

        void printWall() {
            for (int i=0;i<2*h+1;i++) {
                for (int j=0;j<w+2;j++) System.out.print(wall[i][j]);
                System.out.println();
            }
        }
    }
    class Point {
        int x;
        int y;
        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
        int getX() {
            return x;
        }
        int getY() {
            return y;
        }
        void printP() {
            System.out.println(x + " " + y);
        }

        boolean isGoal() {
            if (x == w && y == h ) return true;
            return false;
        }
    }

}