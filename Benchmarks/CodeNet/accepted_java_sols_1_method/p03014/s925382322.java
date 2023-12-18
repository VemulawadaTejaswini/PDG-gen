import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char s[][] = new char[h][w];
        int p[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
        }
        sc.close();
        for (int i = 0; i < h; i++) {
            int c = 0;
            int l = 0;
            for (int j = 0; j < w; j++) {
                if (s[i][j] == '.') {
                    if (c == 0) {
                        l = j;
                    }
                    c++;
                } else if (c > 0) {
                    for (int k = l; k < j; k++) {
                        p[i][k] = c;
                    }
                    c = 0;
                }
                if (j == w - 1 && c > 0) {
                    for (int k = l; k <= j; k++) {
                        p[i][k] = c;
                    }
                }
            }
        }
        int ans = 0;
        for (int j = 0; j < w; j++) {
            int c = 0;
            int l = 0;
            for (int i = 0; i < h; i++) {
                if (p[i][j] > 0) {
                    if (c == 0) {
                        l = i;
                    }
                    c++;
                } else if (c > 0) {
                    for (int k = l; k <= i; k++) {
                        ans = (ans < p[k][j] + c) ? p[k][j] + c : ans;
                    }
                    c = 0;
                }
                if (i == h - 1 && c > 0) {
                    for (int k = l; k <= i; k++) {
                        ans = (ans < p[k][j] + c) ? p[k][j] + c : ans;
                    }
                }
            }
        }
        System.out.println(ans - 1);
    }
}