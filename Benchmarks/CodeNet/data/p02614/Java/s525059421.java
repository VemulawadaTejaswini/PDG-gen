import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();

        char[][] c = new char[H][W];

        int total = 0;
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                c[i][j] = s.charAt(j);
                if (c[i][j] == '#') total++;
            }
        }

        int ans = 0;
        int b = 1 << (H+W);
        for (int x = 0; x < b; x++ ) {
            int tmp = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int ib = 1 << i; 
                    int jb = 1 << (j+H); 
                    if (((x&ib) != 0 || (x&jb) != 0) && c[i][j] == '#') {
                        tmp++;
                    }
                }
            }
            if (total-tmp == K) ans++;
        }

        System.out.println(ans);
    }
}
