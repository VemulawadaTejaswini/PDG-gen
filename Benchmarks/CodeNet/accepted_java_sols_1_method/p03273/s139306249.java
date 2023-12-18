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
        boolean[] row = new boolean[h];
        boolean[] col = new boolean[w];

        for (int i = 0; i < h; i++) {
            String str = br.readLine();
            for (int j = 0; j < w; j++) {
                char c = str.charAt(j);
                mat[i][j] = c;
                if (c == '#') {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            if (!row[i]) continue;
            for (int j = 0; j < w; j++) {
                if (col[j]) {
                    System.out.print(mat[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
}
