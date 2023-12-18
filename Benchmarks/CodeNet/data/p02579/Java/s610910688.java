import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int w = scan.nextInt();
        int ch = scan.nextInt() -1;
        int cw = scan.nextInt() -1;
        int dh = scan.nextInt() -1;
        int dw = scan.nextInt() -1;

        Point start = new Point(ch, cw);
        ArrayDeque<Point> dq = new ArrayDeque<>();
        ArrayDeque<Point> magicDq = new ArrayDeque<>();
        Point[] move = {new Point(0,-1), new Point(1,0), new Point(0,1), new Point(-1,0)};
        dq.add(start);

        char[][] map = new char[h][w];
        int [][] magicCount = new int[h][w];
        int [][] visited = new int[h][w];
        visited[ch][cw] = 1;

        for (int i = 0; i<h; i++) {

            map[i] = scan.next().toCharArray();
        }

        map[ch][cw] = '#';

        while(dq.size()>0) {

            Point a = dq.removeFirst();
            magicDq.addLast(a);

            for (int i=0; i<4; i++) {
                int x = a.x + move[i].x;
                int y = a.y + move[i].y;

                if (x <0 || x>=h || y<0 || y>=w) {
                    continue;
                }

                if (map[x][y] == '.') {
                    dq.addLast(new Point(x,y));
                    visited[x][y] = 1;
                    magicCount[x][y] = magicCount[a.x][a.y];
                    map[x][y] = '#';
                }
            }

            if (dq.isEmpty()) {

                while(magicDq.size()>0) {
                    Point b = magicDq.removeFirst();
                    for (int i = -2; i <= 2; i++) {

                        for (int j = -2; j <= 2; j++) {
                            int x = b.x + i;
                            int y = b.y + j;

                            if (x < 0 || x >= h || y < 0 || y >= w) {
                                continue;
                            }

                            if (map[x][y] == '.') {
                                dq.addLast(new Point(x, y));
                                map[x][y] = '#';
                                magicCount[x][y] = magicCount[b.x][b.y] + 1;
                                visited[x][y] = 1;
                            }
                        }
                    }
                }
            }
        }

        if (visited[dh][dw] > 0) {
            System.out.println(magicCount[dh][dw]);

        } else {
            System.out.println(-1);
        }

    }
}
