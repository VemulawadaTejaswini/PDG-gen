package aoj0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * author: Acrafter
 * date: 2017/1/11
 * time: 22:03
 */
public class Main{
    private static char[][] farm = new char[100][100];
    private static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    private static int result = 0;
    private static int H, W;
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String flagline;
        while (!(flagline=input.readLine()).equals("0 0")){
            String[] HW = flagline.split(" ");
            H = Integer.parseInt(HW[0]); W = Integer.parseInt(HW[1]);
            for (int y = 0; y < H; y++) {
                char[] line = input.readLine().toCharArray();
                farm[y] = line;
            }
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if(farm[y][x]!='W'){
                        dfs(y, x, farm[y][x]);
                        result += 1;
                    }
                }
            }
            System.out.println(result);
            result = 0;
        }
    }

    public static void dfs(int y, int x, char flag){
        farm[y][x] = 'W'; // ?????°??°???
        for(int i=0; i<4; i++){
            int ny = y + dy[i], nx = x + dx[i];
            if (0<=ny && ny<H && 0<=nx && nx<W && farm[ny][nx]==flag) {
                dfs(ny, nx, flag);
            }
        }
    }
}