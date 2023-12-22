import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int w = std.nextInt();
        int[][] table = new int[h + 2][w + 2];

        for (int i = 1; i <= h; i++) {
            String line = std.next();
            for (int j = 1; j <= w; j++) {
                int color = (line.charAt(j - 1) == '#') ? 1 : 0;
                table[i][j] = color;
            }
        }

        boolean enable = true;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                int color = table[i][j];
                if (color == 1) {
                    int left = table[i][j - 1];
                    int right = table[i][j + 1];
                    int top = table[i - 1][j];
                    int bottom = table[i + 1][j];
                    int aroundColor = left | right | top | bottom;
                    if (aroundColor == 0) {
                        enable = false;
                        break;
                    }
                }
            }
        }

        if (enable) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
