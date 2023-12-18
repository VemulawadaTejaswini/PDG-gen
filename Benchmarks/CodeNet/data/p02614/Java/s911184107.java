import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int black=0;
        String[][] c = new String[h][w];
        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                if (c[row][col] == "#") {
                    black = black + 1;
                }
                c[row][col] = sc.next();
            }
        }
        int sum = solve(c, black, k);

        System.out.println(sum);

    }

    public static int solve(String[][] c, int black, int k) {
        int sum=0;

        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[0].length; col++) {
                if (c[row][col] == "#") {
                    black--;
                    if (black == k) {
                        sum++;
                    }
                }
                c[row][col] = "k";
            }
        }
        return sum;
    }
}