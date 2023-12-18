import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N + 1];
        int[] b = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (N > 1 && s == 1 && c == 0) {
                System.out.print("-1");
                return;
            }
            if (b[s] == 0) {
                a[s] = c;
                b[s]++;
            } else {
                if (a[s] != c) {
                    System.out.print("-1");
                    return;
                }
            }
        }

        if (N == 1 && b[1] == 0) {
            System.out.println("0");
            return;
        }
        for (int i = 1; i < N + 1; i++) {
            if (b[i] == 0 && i == 1) {
                a[i] = 1;
            }
            System.out.print(a[i]);
        }
    }
}
