import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long sum = 1;
        for (; n > 0; n--) {
            long a = scan.nextLong();

            if (a == 0) {
                System.out.println(0);
                return;
            }

            if (sum > Long.MAX_VALUE) {
                continue;
            }

            sum *= a;
        }

        if (sum > (long) Math.pow(10, 18)) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
    }
}
