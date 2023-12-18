import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int q = cin.nextInt();
        String s = cin.next();
        int cnt[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
                cnt[i + 1]++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            cnt[i + 1] = cnt[i] + cnt[i + 1];
        }
        for (int i = 0; i < q; i++) {
            int l = cin.nextInt();
            int r = cin.nextInt();
            l--; r--;
            out.println(cnt[r] - cnt[l]);
        }
    }
}
