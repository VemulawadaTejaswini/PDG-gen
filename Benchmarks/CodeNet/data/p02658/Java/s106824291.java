import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 31/05/20
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        long[] nums = new long[n];

        boolean containsZero = false;
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextLong();
            if (nums[i] == 0) {
                containsZero = true;
            }
        }

        if (containsZero) {
            System.out.println(0);
            return;
        }

        long total = nums[0];
        for (int i = 1; i < n; i++) {
            total *= nums[i];
        }
        long mod = Long.parseLong("1000000000000000000");
        if (total > mod) {
            System.out.println("-1");
        } else {
            System.out.println(total);
        }

    }
}
