
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    private static class Point {
        private final int i;
        private final int j;
        
        private Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int startI = sc.nextInt() - 1;
        final int startJ = sc.nextInt() - 1;
        final int endI = sc.nextInt() - 1;
        final int endJ = sc.nextInt() - 1;
        
        final int[][] field = new int[H][W];
        
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            
            for (int j = 0; j < W; j++) {
                field[i][j] = s.charAt(j) == '.'
                        ? -1 // 未検証
                        : -2; //壁
            }
        }
        
        int currJump = 0;
        Queue<Point> testTarget = new ArrayDeque<>();
        testTarget.add(new Point(startI, startJ));
        
        while (true) {
            Set<Point> pointsOfCurrJump = new HashSet<>();
            
            // ジャンプ無しで到達できる位置をすべて調べ上げる
            while (!testTarget.isEmpty()) {
                Point p = testTarget.poll();
                pointsOfCurrJump.add(p);
                
                if (1 <= p.i && field[p.i - 1][p.j] == -1) {
                    field[p.i - 1][p.j] = currJump;
                    testTarget.add(new Point(p.i - 1, p.j));
                }
                if (1 <= p.j && field[p.i][p.j - 1] == -1) {
                    field[p.i][p.j - 1] = currJump;
                    testTarget.add(new Point(p.i, p.j - 1));
                }
                if (p.i <= H - 2 && field[p.i + 1][p.j] == -1) {
                    field[p.i + 1][p.j] = currJump;
                    testTarget.add(new Point(p.i + 1, p.j));
                }
                if (p.j <= W - 2 && field[p.i][p.j + 1] == -1) {
                    field[p.i][p.j + 1] = currJump;
                    testTarget.add(new Point(p.i, p.j + 1));
                }
            }
            
            // ジャンプ無しで到達できる場所を調べつくしたら、
            // そこからジャンプして到達できる位置をすべて調べ上げる
            int j = ++currJump;
            pointsOfCurrJump.forEach(p -> {
                for (int di = -2; di <= 2; di++) {
                    for (int dj = -2; dj <= 2; dj++) {
                        int ni = p.i + di;
                        int nj = p.j + dj;
                        
                        if (0 <= ni && ni < H && 0 <= nj && nj < W && field[ni][nj] == -1) {
                            field[ni][nj] = j;
                            testTarget.add(new Point(ni, nj));
                        }
                    }
                }
            });
            if (field[endI][endJ] != -1 || testTarget.isEmpty()) {
                break;
            }
        }
        System.out.println(field[endI][endJ]);
    }
}
