import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0L;
        for (int i = 0; i < k; i++) {
            ans += a[i];
        }
        System.out.println(ans);
        sc.close();

    }

}
