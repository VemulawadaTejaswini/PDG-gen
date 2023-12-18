import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        char c = S.charAt(0);
        int ans = 0;
        for (int i = 1; i < S.length(); i++) {
            if(c != S.charAt(i)){
               ans++;
               c = S.charAt(i);
            }
        }
        out.println(ans);
    }
}