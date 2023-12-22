

import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();
            int K = sc.nextInt();
            char kc = S.charAt(K - 1);
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                builder.append(c == kc ? c : "*");
            }
            System.out.println(builder);
        }
    }

}
