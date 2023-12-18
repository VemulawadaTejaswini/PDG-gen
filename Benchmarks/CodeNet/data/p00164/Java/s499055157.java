import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            int m = 32, s = 0, c = 0;
            int[] l = new int[n];
            for (int i = 0; i < n; i++)
                l[i] = sc.nextInt();
            while (m > 0) {
                m -= c++ % 2 == 0 ? (m - 1) % 5 : l[s++ % l.length];
                System.out.println(m < 0 ? 0 : m);
            }
        }
    }
}
