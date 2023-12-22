import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int slen = s.length;
        char[] t = sc.next().toCharArray();
        int tlen = t.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < slen-tlen+1; i++) {
            int cnt = 0;
            for (int j = 0; j < tlen; j++) {
                if(s[i+j] != t[j]) cnt++;
            }
            if(cnt < ans) ans = cnt;
        }
        System.out.println(ans);
        sc.close();

    }

}
