import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean init = true;
        boolean overflow = false;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long val = scanner.nextLong();
            if (val == 0) {
                System.out.println(0);
                System.exit(0);
            }
            if (init) {
                sum = val;
                init = false;
            } else if (!overflow) {
                sum = sum * val;
            }

            if (sum > (long) Math.pow(10, 18) || sum < 0) {
                overflow = true;
            }
        }

        if (sum < 0) {
            System.out.println("-1");
        } else if (overflow) {
            System.out.println("-1");
        } else if (sum > (long) Math.pow(10, 18)) {
            System.out.println("-1");
        } else {
            System.out.println(sum);
        }
    }
}