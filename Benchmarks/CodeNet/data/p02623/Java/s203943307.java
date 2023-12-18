import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long k = scanner.nextLong();

        List<Long> alist = new ArrayList<>();
        List<Long> asum = new ArrayList<>();
        List<Long> blist = new ArrayList<>();
        List<Long> bsum = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            alist.add(a);
            if (i > 0) {
                asum.add(asum.get(i - 1) + a);
            } else {
                asum.add(a);
            }
        }

        for (int i = 0; i < m; i++) {
            long b = scanner.nextLong();
            blist.add(b);
            if (i > 0) {
                bsum.add(bsum.get(i - 1) + b);
            } else {
                bsum.add(b);
            }
        }

        long sum = 0;
        while (asum.size() > 0 || bsum.size() > 0) {
            int aidx = asum.size() - 1;
            int bidx = bsum.size() - 1;
            long amax = aidx >= 0 ? asum.get(aidx) : 0;
            long bmax = bidx >= 0 ? bsum.get(bidx) : 0;

            if ((amax + bmax) <= k) {
                sum = asum.size() + bsum.size();
                break;
            }

            if (amax > bmax) {
                asum.remove(aidx);
            } else {
                bsum.remove(bidx);
            }
        }
        System.out.println(sum);

    }

}