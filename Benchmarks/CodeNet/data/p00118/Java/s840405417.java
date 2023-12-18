

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * author: Acrafter
 * date: 2017/1/11
 * time: 22:03
 */
public class Main {
    private static char[][] farm = new char[100][100];
    private static char[][] visited = new char[100][100];
    private static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    private static Queue<P> queue = new LinkedList<P>();
    private static int result = 0;
    private static int H, W;
    static class P{
        int y, x;
        P(int y, int x){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        H = input.nextInt();W = input.nextInt();
        while (H != 0){
            for (int y = 0; y < H; y++) {
                char[] line = input.next().toCharArray();
                farm[y] = line;
                for (int x = 0; x < W; x++) {
                    visited[y][x] = 'O';
                }
            }
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if(visited[y][x]=='O'){
                        bfs(y, x);
                        result += 1;
                    }
                }
            }
            System.out.println(result);
            result = 0;
            H = input.nextInt();W = input.nextInt();
        }
    }

    public static void bfs(int iy, int ix){
        visited[iy][ix] = 'X';
        queue.add(new P(iy,ix));
        for (;!queue.isEmpty();){
            P p = queue.poll();
            int y = p.y, x = p.x;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i], nx = x + dx[i];
                if(0<=ny && ny<H && 0<=nx && nx<W && visited[ny][nx]=='O' && farm[ny][nx]==farm[y][x]){
                    visited[ny][nx] = 'X';
                    queue.add(new P(ny, nx));
                }
            }
        }
    }
}