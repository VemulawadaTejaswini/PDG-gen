import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();

        long ret = 0;

        for (int i = 0; i < Math.pow(2, N - 1); i++) {
            int p = N - 1;

            for (int j = 0; j < N - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    String str = S.substring(N - 1 - j, p + 1);
                    p = (N - 1 - j) - 1;
                    ret += Long.parseLong(str);
                }
            }

            ret += Long.parseLong(S.substring(0, p + 1));
        }

        System.out.println(ret);
    }
}