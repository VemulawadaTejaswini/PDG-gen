import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        long sum = 7;
        if (N <= 6) {
            if (N == 1) {
                System.out.println(1);
            } else if (N < 4) {
                System.out.println(3);
            } else {
                System.out.println(sum);
            }

        } else {
            for (long i = 6; i <= N; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    continue;
                }
                sum += i;
            }
            System.out.println(sum);
        }

    }
}
