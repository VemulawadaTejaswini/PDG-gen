import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        char[] c = S.toCharArray();
        int ans = 0;
        for (int i=0;i<N/2;i++) {
            if (c[i]!=c[N-1-i]) ans++;
        }
        System.out.println(ans);
    }
}