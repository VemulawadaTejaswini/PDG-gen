import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        List<List<Integer>> edge = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            edge.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++) {
            int u = Integer.parseInt(sc.next()) - 1;
            int v = Integer.parseInt(sc.next()) - 1;
            edge.get(u).add(v);
        }
        int[][] d = new int[n][3];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                d[i][j] = -1;
            }
        }
        int s = Integer.parseInt(sc.next()) - 1;
        int t = Integer.parseInt(sc.next()) - 1;
        d[s][0] = 0;
        Queue<Point> que = new ArrayDeque<>();
        que.add(new Point(s, 0));
        boolean flag = true;
        loop : while(!que.isEmpty()) {
            Point p = que.poll();
            List<Integer> to = edge.get(p.x);
            for(int x : to) {
                if(x == t && (p.y + 1) % 3 == 0) {
                    System.out.println((p.y + 1) / 3);
                    flag = false;
                    break loop;
                }
                if(d[x][(p.y + 1) % 3] == -1) {
                    d[x][(p.y + 1) % 3] = p.y + 1;
                    que.add(new Point(x, p.y + 1));
                }
            }
        }
        if(flag) System.out.println(-1);
    }
}