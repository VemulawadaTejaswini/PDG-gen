import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] g = new int[s.length + 1];
        if (s.length == 1) {
            System.out.println(1);
            return;
        }
        g[0] = 0;
        g[1] = 1;
        if (s[0] == s[1]) {
            g[2] = 1;
        } else {
            g[2] = 2;
        }
        for (int i = 3 ; i <= s.length ; i++) {
            if (i >= 3) {
                if (s[i - 1] == s[i - 2]) {
                    g[i] = g[i - 3] + 2;
                } else {
                    g[i] = g[i - 1] + 1;
                }
            }
        }
        System.out.println(g[s.length]);

    }

}
