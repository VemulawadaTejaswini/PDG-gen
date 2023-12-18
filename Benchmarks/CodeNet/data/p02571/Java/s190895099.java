import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String S = scanner.next();
        String T = scanner.next();
        int slen = S.length(), tlen = T.length(), res = 0;
        for (int i = 0; i < slen - tlen + 1; ++i) {
            int cur = 0;
            for (int j = 0; j < tlen; ++j) {
                if (i + j < slen && S.charAt(i + j) == T.charAt(j)) cur += 1;
            }
            res = Math.max(res, cur);
        }
        System.out.println(tlen - res);
    }

}