import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] ai = new long[n];
        Map<Long , Integer> aj = new HashMap<>();
        for (int i=0;i<n;i++) {
            a[i] = sc.nextLong();
            ai[i] = a[i] + i;
            if (aj.containsKey(i - a[i])) {
                aj.put((i - a[i]), aj.get(i - a[i]) + 1);
            } else {
                aj.put((i - a[i]), 1);
            }
        }
        long ans=0;
        for (int i=0;i<n;i++) {
            if (aj.containsKey(ai[i])) {
                ans+=aj.get(ai[i]);
            }
        }
        System.out.println(ans);
    }
}
