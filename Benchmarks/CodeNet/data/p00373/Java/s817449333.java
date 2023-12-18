import java.util.Scanner;

//0378
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt(), tw = sc.nextInt(), th = sc.nextInt();
        char[][] l = new char[h][w];
        long[][] ll = new long[h][w - tw + 1];
        char[][] t = new char[th][tw];
        long[][] tt = new long[th][(tw - 1) / 10 + 1];
        for (int i = 0; i < h; i++) {
            l[i] = sc.next().toCharArray();
            for (int j = 0; j < w - tw + 1; j++) {
                for (int k = 0; k < Math.min(tw, 10); k++) {
                    int n = l[i][j + k];
                    long a = n == '?' ? 63 : n <= '9' ? n - 47 : n <= 'Z' ? n - 54 : n - 60;
                    ll[i][j] += a;
                    ll[i][j] <<= 6;
                }
            }
        }
        for (int i = 0; i < th; i++) {
            t[i] = sc.next().toCharArray();
            for (int j = 0; j < tw; j++) {
                long a = t[i][j] == '?' ? 0 : t[i][j] <= '9' ? t[i][j] - 47 : t[i][j] <= 'Z' ? t[i][j] - 54 : t[i][j] - 60;
                tt[i][j / Math.min(tw, 10)] += a;
                tt[i][j / Math.min(tw, 10)] <<= 6;
            }
        }
        int c = 0;
        for (int i = 0; i < h - th + 1; i++) {
            for (int j = 0; j < w - tw + 1; j++) {
                boolean f = true;
                out: for (int k = 0; k < th; k++) {
                    for (int g = 0; g < (tw - 1) / 10 + 1; g++) {
                        if ((ll[i + k][j + g] | tt[k][g]) != ll[i + k][j + g]) {
                            f = false;
                            break out;
                        }
                    }
                }
                if (f)
                    c++;
            }
        }
        System.out.println(c);
    }
}

