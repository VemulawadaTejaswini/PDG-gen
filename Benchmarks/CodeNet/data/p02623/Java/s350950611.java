import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextLong();

        List<Long> asum = new ArrayList<>();
        List<Long> bsum = new ArrayList<>();

        long amax = 0;
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();

            if (asum.isEmpty()) {
                amax = a;
            } else {
                amax = amax + a;
            }

            if (amax > k) {
                continue;
            }
            asum.add(amax);

        }

        long max = asum.size();
        long bmax = 0;
        for (int i = 0; i < m; i++) {
            long b = scanner.nextLong();
            if (bsum.isEmpty()) {
                bmax = b;
            } else {
                bmax = bmax + b;
            }

            if (bmax > k) {
                System.out.println(max);
                System.exit(0);
            }
            bsum.add(bmax);

            if (asum.isEmpty()) {
                if (max < bsum.size()) {
                    max = bsum.size();
                }
            } else {
                for (int j = asum.size() - 1; j >= 0; j--) {
                    long sum = bsum.size() + (j + 1);
                    if (max >= sum) {
                        break;
                    }
                    long combined = asum.get(j) + bmax;
                    if (combined <= k) {
                        if (max < sum) {
                            max = sum;
                        }
                        break;
//                    } else {
//                        asum.remove(j);
                    }
                }
            }
        }
        System.out.println(max);

    }

}