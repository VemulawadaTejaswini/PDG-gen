

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            final int k = sc.nextInt();

            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 5; j++) {
                    if ((nums[j] - nums[i]) > k) {
                        System.out.println(":(");
                        return;
                    }
                }
            }
            System.out.println("Yay!");
        }
    }
}
