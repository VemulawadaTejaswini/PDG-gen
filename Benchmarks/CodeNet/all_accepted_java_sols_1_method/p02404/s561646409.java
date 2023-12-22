import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0)
                break;

            char rect[][] = new char[h][w];
            for (char[] e : rect)
                Arrays.fill(e, '#');

            int h2 = h - 2;
            int w2 = w - 2;
            for (int x = 0; x < w2; x++)
                for (int y = 0; y < h2; y++)
                    rect[y+1][x+1] = '.';

            for (char[] e : rect)
                System.out.println(e);
            System.out.println();
        }
    }
}