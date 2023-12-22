import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        try (Scanner scanner = new Scanner(System.in)){
            int[] in = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = in[0];
            int d = in[1];
            int[][] x = new int[n][d];
            for (int i = 0; i < n; i++) {
                x[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            int count = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    double l = 0;
                    for (int k = 0; k < d; k++) {
                        int tmp = x[j][k] - x[i][k];
                        l += tmp * tmp;
                    }
                    if (Math.sqrt(l) % 1 == 0) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
}
