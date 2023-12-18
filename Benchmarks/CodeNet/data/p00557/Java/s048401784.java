import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] field = new int[h + 2][w + 2];
        int[] arr = new int[h * w];
        for (int i = 0; i < h * w; i++) {
            int x = sc.nextInt();
            arr[x - 1] = i;
        }
        int count = 0;
        for (int i = 0; i < h * w; i++) {
            int hh = arr[i] / w + 1;
            int ww = arr[i] % w + 1;
            int[] besides = new int[]{field[hh - 1][ww], field[hh][ww - 1], field[hh + 1][ww], field[hh][ww + 1]};
            Arrays.sort(besides);
            if (besides[0] == -1) {
                field[hh][ww] = -1;
                count++;
            } else {
                int x = besides[0];
                for (int j = 1; j < 4; j++) {
                    if (x == 0) {
                        x = besides[j];
                    } else {
                        if (x != besides[j]) {
                            field[hh][ww] = -1;
                            count++;
                            break;
                        }
                    }
                }
                if (field[hh][ww] == -1) {
                    continue;
                }
                if (x == 0) {
                    field[hh][ww] = i + 1;
                } else {
                    field[hh][ww] = x;
                }
            }
        }
        System.out.println(count);
    }
}
