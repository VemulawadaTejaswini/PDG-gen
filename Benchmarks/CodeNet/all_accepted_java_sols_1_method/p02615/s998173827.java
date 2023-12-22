import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a, (x,y) -> Long.compare(y, x));
        long ans = a[0];
        int cnt = 2;
        for (int i = 1; i < n; i++) {
            if(cnt == n)break;
            ans += a[i];
            if(n == ++cnt) break;
            ans += a[i];
            if(n == ++cnt) break;
        }
        System.out.println(ans);
        sc.close();

    }

}
