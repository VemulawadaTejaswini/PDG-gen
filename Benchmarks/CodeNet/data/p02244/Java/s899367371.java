import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main();
    }

    static final int N = 8;
    int[][] input;

    QueensBoard board = new QueensBoard();

    public Main() {
      try{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = Integer.parseInt(s);
        input = new int[n][n];

        for(int i=0 ; i<n ; i++){
          StringTokenizer S = new StringTokenizer(bf.readLine());
          for(int j=0 ; j<2 ; j++){
          input[i][j] = Integer.parseInt(S.nextToken());
            }
          }
        }
      catch(IOException e){
        System.out.println(e);
      }
        dfs(0);
    }

    //深さ優先探索
    boolean dfs(int y) {
        if (y == N) {
            if (board.checkInput(input)) {
                System.out.println(board);
                return true;
            }
            return false;
        }
        for (int x = 0; x < N; x++) {
            if (!board.isAttacked(x, y)) {
                board.setQueen(x, y, true);
                if (dfs(y + 1)) {
                    return true;
                }
                board.setQueen(x, y, false);
            }
        }
        return false;
    }

    //クイーンの配置ボード クラス
    class QueensBoard {
        boolean[] row = new boolean[N];            //行(─)の襲撃を表す
        boolean[] col = new boolean[N];            //列(│)の襲撃を表す
        boolean[] pos = new boolean[2 * N - 1];    //斜め(／)の襲撃を表す
        boolean[] neg = new boolean[2 * N - 1];    //逆斜め(＼)の襲撃を表す
        boolean[][] board = new boolean[N][N];     //クイーンの配置を表す
        //配置によるフラグのセット
        void setQueen(int x, int y, boolean flg) {
            row[y] = flg;
            col[x] = flg;
            pos[y + x] = flg;
            neg[y - x + N - 1] = flg;
            board[y][x] = flg;
        }
        //既に襲撃フラグがあるか
        boolean isAttacked(int x, int y) {
            if (row[y] || col[x] || pos[y + x] || neg[y - x + N - 1]) {
                return true;
            }
            return false;
        }
        boolean checkInput(int[][] input) {
            for (int i = 0; i < input.length; i++) {
                int y = input[i][0];
                int x = input[i][1];
                if (!board[y][x]) {
                    return false;
                }
            }
            return true;
        }
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(N * N + N);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(board[i][j] ? "Q" : ".");
                }
                if(i!=7)sb.append("\n");
            }
            return sb.toString();
        }
    }
}

