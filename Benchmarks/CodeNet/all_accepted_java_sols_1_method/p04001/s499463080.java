import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.nextLine().toCharArray();
        int n = S.length;

        long ans = 0;
        for (int i = 0; i < (1 << n - 1); i++) {
            // char -> long
            long tmp = (S[0] - '0');
            for (int j = 0; j < n - 1; j++) {
                if ((i & (1 << j)) != 0) {
                    ans += tmp;
                    tmp = 0;
                }

                tmp = (tmp * 10) + (S[j + 1] - '0');
            }
            ans += tmp;
        }

        System.out.println(ans);
    }
}
