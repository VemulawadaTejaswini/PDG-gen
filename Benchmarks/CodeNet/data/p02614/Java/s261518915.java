import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] board = new String[H];
        for (int h = 0; h < H; h++) {
            board[h] = in.readLine();
        }
        int[] C = new int[W];
        int[] R = new int[H];
        int total = 0;
        for (int r = 0; r < H; r++) {
            for (int c = 0; c < W; c++) {
                char ch = board[r].charAt(c);
                if (ch == '#') {
                    total++;
                    C[c]++;
                    R[r]++;
                }
            }
        }

        int ans = 0;
        for (int maskR = 0; maskR < 1<<H; maskR++) {
            for (int maskC = 0; maskC < 1<<W; maskC++) {
                if (valid(maskR, maskC, total, K, R, C, board)) {
                    ++ ans;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean valid(int maskR, int maskC, int total, int k, int[] R, int[] C, String[] board) {
        int c = 0;
        ArrayList<Integer> rows = new ArrayList<>();
        for (int bit = 0; bit < 6; bit++) {
            if ((maskR & (1<<bit)) != 0) {
                c += R[bit];
                rows.add(bit);
            }
        }
        ArrayList<Integer> cols = new ArrayList<>();
        for (int bit = 0; bit < 6; bit++) {
            if ((maskC & (1<<bit)) != 0) {
                c += C[bit];
                cols.add(bit);
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < cols.size(); j++) {
                int row = rows.get(i);
                int col = cols.get(j);
                if (board[row].charAt(col) == '#') --c;
            }
        }
        return (total - c) == k;
    }

}
