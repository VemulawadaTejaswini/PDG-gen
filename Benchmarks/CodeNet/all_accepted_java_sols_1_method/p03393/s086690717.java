import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] appearance = new int[26];
        for(int i = 0, f = s.length(); i < f; ++i) {
            ++appearance[s.charAt(i) - 'a'];
        }
        
        if(s.length() < 26) {
            for(int i = 0; i < 26; ++i) {
                if(appearance[i] == 0) {
                    char x = (char)('a' + i);
                    System.out.println(s + x);
                    return;
                }
            }
        }
        
        int si = 0;
        for(int i = 25; i > 0; --i) {
            if(s.charAt(i - 1) < s.charAt(i)) {
                si = i;
                break;
            }
        }
        
        if(si == 0) {
            System.out.println(-1);
            return;
        }
        
        char r = s.charAt(si - 1);
        char q = 'z';
        for(int i = 25; i >= si; --i) {
            char tmp = s.charAt(i);
            if(tmp > r) q = (tmp < q) ? tmp : q;
        }
        StringBuilder ans = new StringBuilder(s.substring(0, si - 1)).append(q);
        System.out.println(ans.toString());
    }
}
