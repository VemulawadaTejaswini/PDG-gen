import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        @SuppressWarnings("unchecked")
        List<Long>[] sum = new List[8];
        // sum[0] = + xi + yi + zi
        // sum[1] = + xi + yi - zi
        // sum[2] = + xi - yi + zi
        // sum[3] = + xi - yi - zi
        // sum[4] = - xi + yi + zi
        // sum[5] = - xi + yi - zi
        // sum[6] = - xi - yi + zi
        // sum[7] = - xi - yi - zi
        for (int i = 0; i < 8; i++) {
            sum[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            sum[0].add(+x + y + z);
            sum[1].add(+x + y - z);
            sum[2].add(+x - y + z);
            sum[3].add(+x - y - z);
            sum[4].add(-x + y + z);
            sum[5].add(-x + y - z);
            sum[6].add(-x - y + z);
            sum[7].add(-x - y - z);
        }

        long ans = 0;
        for (int i = 0; i < 8; i++) {
            Collections.sort(sum[i]);
//            System.out.println(sum[i]);
//            System.out.println("----");
            long candidate = 0;
            for (int j = 0; j < m; j++) {
                candidate += sum[i].get(n - 1 - j);
            }
//            System.out.println(candidate);
            if (candidate > ans) {
                ans = candidate;
            }
        }
        System.out.println(ans);

        sc.close();
    }

}
