import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int[][] g = new int[a][a];
        for (int i = 0; i < a; i++) {
            Arrays.fill(g[i], 99999999);
        }
        for (int i = 0; i < b; i++) {
            String[] l = s.next().split(",");
            int c = Integer.parseInt(l[0]) - 1, d = Integer.parseInt(l[1]) - 1, e = Integer.parseInt(l[2]), f = Integer.parseInt(l[3]);
            g[c][d] = e;
            g[d][c] = f;
        }
        String[] l = s.next().split(",");
        int c = Integer.parseInt(l[0]) - 1, d = Integer.parseInt(l[1]) - 1, e = Integer.parseInt(l[2]), f = Integer.parseInt(l[3]);
        for (int i = 0; i < a; i++)
            for (int j = 0; j < a; j++)
                for (int k = 0; k < a; k++)
                    if (g[j][k] > g[j][i] + g[i][k])
                        g[j][k] = g[j][i] + g[i][k];
        System.out.println(e - f - g[c][d] - g[d][c]);
    }
}

