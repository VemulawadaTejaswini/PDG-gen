import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxWeight = sc.nextInt();
        long[] weights = new long[count];
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            weights[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }
        int maxValue = 100001;
        long[][] res = new long[count][maxValue];
        boolean[][] b = new boolean[count][maxValue];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < maxValue; j++) {
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < maxValue; i++) {
            b[0][i] = true;
        }
        res[0][values[0]] = weights[0];
        res[0][0] = 0;

        for (int i = 1; i < count; i++) {
            for (int j = 0; j < maxValue; j++) {
                long without = res[i - 1][j];
                long with = Integer.MAX_VALUE;

                if (j >= values[i]) {
                    with = res[i - 1][j - values[i]] + weights[i];
                }
                res[i][j] = Math.min(without, with);
            }
        }


        int min = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < maxValue; j++) {
                if (res[i][j] <= maxWeight) {
                    min = Math.max(j, min);
                }

            }
        }
        System.out.println(min);
    }

}