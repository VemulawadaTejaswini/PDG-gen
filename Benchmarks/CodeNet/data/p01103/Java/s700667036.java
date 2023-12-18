import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int h = in.nextInt(), w = in.nextInt();
        while (h != 0) {
            int[][] b = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    b[i][j] = in.nextInt();
                }
            }

            int ans = 0;
            for (int i = 0; i < h - 2; i++) {
                for (int j = 0; j < w - 2; j++) {

                    for (int k = i + 2; k < h; k++) {
                        inner: for (int l = j + 2; l < w; l++) {
                            int min = Integer.MAX_VALUE;
                            for (int m = i; m <= k; m++) {
                                min = Math.min(min, b[m][j]);
                                min = Math.min(min, b[m][l]);
                            }
                            for (int n = j; n <= l; n++) {
                                min = Math.min(min, b[i][n]);
                                min = Math.min(min, b[k][n]);
                            }
                            //System.out.println("MIH" + min);

                            int v = 0;
                            for (int m = i + 1; m <= k - 1; m++) {
                                for (int n = j + 1; n <= l - 1; n++) {
                                    if (b[m][n] >= min) continue inner;
                                    v += min - b[m][n];
                                }
                            }
                            ans = Math.max(ans, v);
                        }
                    }
                }
            }
            out.println(ans);

            h = in.nextInt();
            w = in.nextInt();
        }
        out.flush();
    }

    private static List<String> parse(String s, boolean init) {
        List<String> res = new ArrayList<>();
        boolean q = init;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '"') {
                if (q) {
                    res.add(sb.toString());
                    q = false;
                } else {
                    sb.setLength(0);
                    q = true;
                }
            } else if (q) {
                sb.append(c);
            }
        }
        if (q) {
            res.add(sb.toString());
        }
        return res;
    }

}

