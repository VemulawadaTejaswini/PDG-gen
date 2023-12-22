import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();
        final int[] h = new int[N];
        final int maxHeight;
        {
            int maxHeightCandidate = 0;
            for (int k = 1; k <= N; k++) {
                h[k - 1] = scanner.nextInt();
                if (maxHeightCandidate < h[k - 1]) {
                    maxHeightCandidate = h[k - 1];
                }
            }
            maxHeight = maxHeightCandidate;
        }

        int totalCount = 0;
        for (int height = 1; height <= maxHeight; height++) {
            int countPerHeight = 0;
            boolean exists = false;
            for (int k = 1; k <= N; k++) {
                if (exists) {
                    if (h[k - 1] < height) {
                        exists = false;
                    }
                } else {
                    if (h[k - 1] >= height) {
                        exists = true;
                        countPerHeight++;
                    }
                }
            }
            totalCount += countPerHeight;
        }
        System.out.println(totalCount);
    }
}
