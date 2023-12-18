import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int p = 2019;
        char c[] = str.toCharArray();
        int n = str.length();
        int[] d = new int[n+1];
        int ten = 1;
        for (int i = n - 1; i >= 0; i--) {
            int a = (c[i] - '0') * ten % p;
            d[i] = (d[i+1]+a) % p;
            ten *= 10;
            ten %= p;
        }
        
        int[] cnt = new int[p];
        long ans = 0;
        for (int i = n; i >= 0; i--) {
            ans += cnt[d[i]];
            cnt[d[i]]++;
        }
        System.out.println(ans);
    }
}
