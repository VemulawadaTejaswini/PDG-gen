import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        int[] c = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int max = (int) Math.pow(10, n);
        for (int i = 0; i < max; i++) {
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                int a = 0;
                if (n - s[j] == 0) {
                    a = i % 10;
                }
                if (n - s[j] == 1) {
                    a = i / 10;
                    a %= 10;
                }
                if (n - s[j] == 2) {
                    a = i / 10;
                    a /= 10;
                    a %= 10;
                }
                if (a != c[j]) {
                    ok = false;
                }
//                System.out.println(a);
            }
            if (ok) {
                if (String.valueOf(i).length() == n) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}