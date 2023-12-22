import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] c = S.toCharArray();
        int N = S.length();
        int ans=N/2;
        loop:for (ans=N/2;ans<=N;ans++) {
            // for (int j=N-ans+1;j<ans;j++) {
            for (int j=N-ans+1;j<ans;j+=Math.max(1, 2*ans-N-2)) {
                if (c[j]!=c[j-1]) {
                    break loop;
                }
            }
        }
        System.out.println(ans-1);
    }
}