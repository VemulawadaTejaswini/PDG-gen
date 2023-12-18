import java.util.*;
public class Main {
    public static void main(String[] args) {
        while (true) {
            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            if (n == 0) break;
            int[] a = new int[n];
            for (int i - 0; i < n; i++)
                a[i] = Integer.parseInt(sc.next());
            int max = 0;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    max = Math.max(max, (a[i] + a[j] <= m)? a[i] + a[j] : 0);
            System.out.println((max == 0)? "NONE" : max);
        }
    }
}
