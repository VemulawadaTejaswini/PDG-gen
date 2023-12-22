

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            final int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int result = 0;
            int maxPad = 0;
            for (int i = 0; i < nums.length; i++) {
                int pad = nums[i] % 10 == 0 ? 0 : 10 - (nums[i] % 10);
                maxPad = Math.max(maxPad, pad);
                result += nums[i] + pad;
            }
            result -= maxPad;
            System.out.println(result);
        }
    }
}
