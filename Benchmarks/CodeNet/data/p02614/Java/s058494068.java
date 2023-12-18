import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int K = sc.nextInt();

            char[][] c2 = new char[H][W];
            for (int r = 0; r < H; r++) {
                c2[r] = sc.next().toCharArray();
            }

            int count = 0;
            for (int maskR = 0; maskR < 1 << H; maskR++) {
                for (int maskC = 0; maskC < 1 << W; maskC++) {

                    int numBlacks = 0;
                    for (int r = 0; r < H; r++) {
                        if ((maskR & (1 << r)) == 0) {
                            continue;
                        }
                        for (int c = 0; c < W; c++) {
                            if ((maskC & (1 << c)) == 0) {
                                continue;
                            }

                            if (c2[r][c] == '#') {
                                numBlacks++;
                            }
                        }
                    }

                    if (numBlacks == K) {
                        count++;
                    }

                }
            }

            System.out.println(count);
        }
    }
}
