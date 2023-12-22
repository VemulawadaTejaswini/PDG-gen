

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            final long N = sc.nextLong();
            final long[] nums = new long[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextLong();
            }
            long min = Long.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            long minutes = (N / min) + (N % min > 0 ? 1 : 0) + 4;
            System.out.println(minutes);
        }
    }
}
