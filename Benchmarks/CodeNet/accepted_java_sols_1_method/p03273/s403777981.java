import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());
        final int h = Integer.parseInt(tok.nextToken());
        final int w = Integer.parseInt(tok.nextToken());
        char[][] mat = new char[h][w];
        boolean[] colVisible = new boolean[w];

        // 読み込み
        int cnt = 0;
        boolean flag;
        String row;
        char c;
        for (int i = 0; i < h; i++) {
            flag = false;
            row = br.readLine();
            for (int j = 0; j < w; j++) {
                c = row.charAt(j);
                mat[cnt][j] = c;
                if (c == '#') {
                    flag = true;
                    colVisible[j] = true;
                }
            }
            if (flag) cnt++;
        }
        // 表示
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < w; j++) {
                if (colVisible[j])
                    System.out.print(mat[i][j]);
            }
            System.out.print("\n");
        }
    }
}
