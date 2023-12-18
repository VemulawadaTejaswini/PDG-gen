import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        Point.setSize(W, H);
        int Ch = sc.nextInt();
        int Cw = sc.nextInt();
        int Dh = sc.nextInt();
        int Dw = sc.nextInt();
        Point start = new Point(Cw, Ch);
        Point goal = new Point(Dw, Dh);
        char map[][] = new char[H+1][W+1];
        int step[][] = new int[H+1][W+1];
        for(int s=1; s<=H; s++) {
            String tmp = sc.next();
            for(int t=1; t<=W; t++) {
                map[s][t] = tmp.charAt(t-1);
                step[s][t] = Integer.MAX_VALUE;
            }
        }
        ArrayDeque<Point> dq = new ArrayDeque<>();
        dq.add(start);
        step[Ch][Cw] = 0;
        Diff walks[] = {new Diff(-1,0), new Diff(0,-1), new Diff(1, 0), new Diff(0,1) };
        Diff warps[] = {
                new Diff(-2, -2), new Diff(-1, -2), new Diff(0, -2), new Diff(1, -2), new Diff(2, -2),
                new Diff(-2, -1), new Diff(-1, -1),                          new Diff(1, -1), new Diff(2, -1),
                new Diff(-2, 0),                                                                              new Diff(2, 0),
                new Diff(-2, 1), new Diff(-1, 1),                            new Diff(1, 1), new Diff(2, 1),
                new Diff(-2, 2), new Diff(-1, 2), new Diff(0, 2), new Diff(1, 2), new Diff(2, 2),
        };
        while(dq.size()>0) {
            Point p = dq.removeFirst();
            int currentStep = step[p.y][p.x];
            for(Diff d1 : walks) {
                Point p_walk = p.getNeighbourIfExist(d1);
                if(p_walk==null) continue;
                if(map[p_walk.y][p_walk.x] == '#') continue;
                if(step[p_walk.y][p_walk.x]<= currentStep) continue;
                step[p_walk.y][p_walk.x] = currentStep;
                dq.addFirst(p_walk);
            }
            for(Diff d2 : warps) {
                Point p_warp = p.getNeighbourIfExist(d2);
                if(p_warp==null) continue;
                if(map[p_warp.y][p_warp.x] == '#') continue;
                if(step[p_warp.y][p_warp.x]<=currentStep + 1) continue;
                step[p_warp.y][p_warp.x] = currentStep + 1;
                dq.addLast(p_warp);
            }
        }
//        for(int s=1; s<=H; s++) {
//            for(int t=1; t<=W; t++) {
//                System.out.printf("%d,", step[s][t] == Integer.MAX_VALUE ? -1 : step[s][t]);
//            }
//            System.out.println();
//        }
        System.out.println(Integer.MAX_VALUE == step[goal.y][goal.x] ? -1 : step[goal.y][goal.x]);
    }

    static class Point {
        static int XX;
        static int YY;
        static void setSize(int x, int y) {
            XX = x; YY = y;
        }
        int x;
        int y;
        int step;
        Point(int a, int b) { x=a; y=b; }
        Point getNeighbourIfExist(Diff d) {
            if(x + d.xx <= 0 || x + d.xx > XX) return null;
            if(y + d.yy <= 0 || y + d.yy > YY) return null;
            return new Point(x + d.xx, y + d.yy);
        }

    }

    static class Diff {
        int xx;
        int yy;
        Diff(int a, int b) { xx=a; yy=b; }
    }
}
