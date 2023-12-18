import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextLong();

        List<Long> asum = new ArrayList<>();
        List<Long> bsum = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();

            long amax = 0;
            if (asum.isEmpty()) {
                amax = a;
            } else {
                amax = asum.get(asum.size() - 1) + a;
            }

            if (amax > k) {
                continue;
            }
            asum.add(amax);

        }

        long max = 0;
        for (int i = 0; i < m; i++) {
            long b = scanner.nextLong();
            long bmax = 0;
            if (bsum.isEmpty()) {
                bmax = b;
            } else {
                bmax = bsum.get(bsum.size() - 1) + b;
            }

            if (bmax > k) {
                continue;
            }
            bsum.add(bmax);

            for (int j = asum.size() - 1; j >= 0; j--) {
                long sum = (i + 1) + (j + 1);
                if (max > sum) {
                    break;
                }
                long combined = asum.get(j) + bmax;
                if (combined <= k) {
                    if (max < sum) {
                        max = sum;
                    }
                    break;
                }
            }
        }
        System.out.println(max);

    }

}