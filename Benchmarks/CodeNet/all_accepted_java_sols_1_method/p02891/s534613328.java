import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int k = sc.nextInt();
        long ans = 0L;
        int rl = 1;
        for(int i = 1, f = s.length; i < f; ++i) {
            if(s[i - 1] == s[i]) {
                ++rl;
            } else {
                ans += (rl / 2L);
                rl = 1;
            }
        }
        if(rl == s.length) {
            System.out.println(1L * s.length * k >> 1L);
            return;
        }
        
        ans += (rl / 2L);
        rl = 1;
        ans *= k;
        
        if(s[0] == s[s.length - 1]) {
            int a = 1;
            for(int i = 1, f = s.length; i < f; ++i) {
                if(s[i] != s[0]) break;
                ++a;
            }
            
            int b = 1;
            for(int i = s.length - 2; i >= 0; --i) {
                if(s[i] != s[s.length - 1]) break;
                ++b;
            }
            ans -= (a / 2L + b / 2L - (a + b) / 2L) * (k - 1L);
        }
        System.out.println(ans);
    }
}
