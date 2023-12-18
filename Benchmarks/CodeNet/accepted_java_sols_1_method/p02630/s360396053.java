import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ans += x;
            a[x]++;
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            ans += a[b] * (c - b);
            sb.append(ans + "\n");
            a[c] += a[b];
            a[b] = 0;
        }
        System.out.println(sb.toString());
        sc.close();

    }

}
