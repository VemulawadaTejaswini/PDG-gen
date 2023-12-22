import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int o = 0;
            int x = 0;
            int k = S.length();
            for (int i = 0; i < k; i++) {
                char charAt = S.charAt(i);
                if (charAt == 'o') {
                    o++;
                }
                if (charAt == 'x') {
                    x++;
                }
            }
            System.out.println(x >= 8 ? "NO" : "YES");
        }
    }
}

