import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        boolean grid[][] = new boolean[y][x];
        for (int iy = 0; iy < y; iy++) {
            String tmpStr[] = sc.next().split("");
            for (int ix = 0; ix < x; ix++) {
                grid[iy][ix] = tmpStr[ix].equals("#");
            }
        }

        for (int iy = 0; iy < y; iy++) {
            for (int ix = 0; ix < x; ix++) {
                if (!grid[iy][ix]) {
                    continue;
                }

                if ((iy > 0 && grid[iy - 1][ix]) ||
                    (iy < y - 1 && grid[iy + 1][ix]) ||
                    (ix > 0 && grid[iy][ix - 1]) ||
                    (ix < x - 1 && grid[iy][ix + 1]))
                {
                    continue;
                }
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}