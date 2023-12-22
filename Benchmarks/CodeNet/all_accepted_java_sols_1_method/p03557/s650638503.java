import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Long> as = new ArrayList<>();
        List<Long> bs = new ArrayList<>();
        List<Long> cs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            as.add(sc.nextLong());
        }
        for (int i = 0; i < N; i++) {
            bs.add(sc.nextLong());
        }
        for (int i = 0; i < N; i++) {
            cs.add(sc.nextLong());
        }
        Collections.sort(as);
        Collections.sort(bs);
        Collections.sort(cs);

        long ans = 0;
        for (int i = 0; i < N; i++) {
            long b = bs.get(i);

            //lower_bound
            long lowerResult = Collections.binarySearch(as, b, (x, y) -> x.compareTo(y) >= 0 ? 1 : -1);
            lowerResult = (lowerResult >= 0)? lowerResult : ~lowerResult;

            // upper_bound
            long upperResult = Collections.binarySearch(cs, b, (x, y) -> x.compareTo(y) > 0 ? 1 : -1);
            upperResult = (upperResult >= 0)? upperResult : ~upperResult;

            ans += lowerResult * (N - upperResult);
        }
        System.out.println(ans);
    }
}