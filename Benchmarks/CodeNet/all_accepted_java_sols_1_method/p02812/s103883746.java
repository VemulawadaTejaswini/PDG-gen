import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        for(int i = 0; i + 3 <= N; ++i) {
            ans += ("ABC".equals(S.substring(i, i + 3))) ? 1 : 0;
        }
        System.out.println(ans);
    }
}