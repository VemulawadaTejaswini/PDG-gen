import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        int r = N;
        int w = 0;
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (c == 'W') {
                w++;
                continue;
            }

            while (i < r && (S.charAt(r-1) == 'W' || w > 0)) {
                r--;
                if (S.charAt(r) == 'R') {
                    w--;
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
