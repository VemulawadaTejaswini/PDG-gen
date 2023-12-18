import java.util.*;

public class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        for (int i = 0; i < k; i++) {
            ans += p[i];
        }
        System.out.println(ans);
    }
}