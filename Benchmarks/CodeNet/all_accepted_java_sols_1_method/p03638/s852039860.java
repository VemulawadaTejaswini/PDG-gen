import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        int[][] ret = new int[H][W];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < a[i]; j++) {
                int row = index / W;
                int tmp = index % W;
                if(row % 2 == 0) {
                    ret[row][tmp] = i;
                }
                else {
                    ret[row][W - tmp - 1] = i;
                }
                index++;
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(ret[i][j] + 1 + " ");
            }
            System.out.println();
        }
    }

}
