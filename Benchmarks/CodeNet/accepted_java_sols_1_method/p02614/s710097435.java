import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();

        char c[][];
        c = new char[H][W];

        for (int i = 0; i < H; i++) {
            String line = sc.next();
            for (int j = 0; j < W; j++) {
                c[i][j] = line.charAt(j);
            }
        }
        sc.close();

        int ans = 0;
        for (byte is = 0; is < 1 << H; is++) {
            for (byte js = 0; js < 1 << W; js++) {

                int cnt = 0;
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        if ((is >> i & 1) == 1) {
                            continue;
                        }
                        if ((js >> j & 1) == 1) {
                            continue;
                        }
                        if (c[i][j] == '#') {
                            cnt++;
                        }
                    }
                }
                if (cnt == K) {
                    ans++;
                }

            }
        }
        System.out.println(ans);
    }
}
