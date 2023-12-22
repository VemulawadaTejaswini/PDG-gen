import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int masu[][] = new int[h + 2][w + 2];
        String s[] = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                char c = s[i].charAt(j);
                if (c == '#') {
                    masu[i + 1][j + 1] = 1;
                }
            }
        }
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (masu[i][j] == 1) {
                    System.out.print('#');
                } else {
                    int wa = masu[i - 1][j - 1];
                    wa += masu[i - 1][j];
                    wa += masu[i - 1][j + 1];
                    wa += masu[i][j - 1];
                    wa += masu[i][j + 1];
                    wa += masu[i + 1][j - 1];
                    wa += masu[i + 1][j];
                    wa += masu[i + 1][j + 1];
                    System.out.print(wa);
                }
            }
            System.out.println();
        }

    }
}