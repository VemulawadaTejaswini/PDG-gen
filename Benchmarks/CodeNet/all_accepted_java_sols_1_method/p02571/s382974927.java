import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            String T = sc.next();

            int cnt = 0, min = T.length();
            for (int i = 0; i <= S.length() - T.length(); i++) {
                cnt = 0;
                for (int j = 0; j < T.length(); j++) {
                    if (S.charAt(i + j) != T.charAt(j)) {
                        cnt++;
                    }
                }
                min = Math.min(cnt, min);
            }
            System.out.println(min);
        }
    }
}
