import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        int[] ballIndexes = new int[n];
        long[] cnt = new long[200005];
        for(int i = 0; i < n; ++i) {
            ballIndexes[i] = Integer.parseInt(sc.next());
            ++cnt[ballIndexes[i]];
        }

        long allPatterns = 0;
        for(int i = 0, f = cnt.length; i < f; ++i) {
            allPatterns += cnt[i] * (cnt[i] - 1L) / 2L;
        }

        for(int i = 0; i < n; ++i) {
            int bIndex = ballIndexes[i];
            long count = cnt[bIndex];
            System.out.println(allPatterns - (count - 1));
        }
    }
}