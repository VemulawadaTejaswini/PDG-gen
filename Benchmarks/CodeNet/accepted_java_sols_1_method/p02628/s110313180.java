import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int ans = 0;
        for(int j = 0; j < k; j++) {
            ans += p[j];
        }
        System.out.println(ans);
    }
}