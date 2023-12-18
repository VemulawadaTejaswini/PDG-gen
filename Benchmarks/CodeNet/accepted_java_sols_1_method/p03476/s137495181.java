import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] f = new boolean[100001];
        int[] c = new int[100002];
        for (int i = 2; i <= 100000; i++) {
            if (!f[i]) {
                for (int j = i + i; j <= 100000; j += i) {
                    f[j] = true;
                }
            }
        }
        for (int i = 3; i <= 100000; i += 2) {
            if (!f[i] && !f[(i + 1) / 2]) {
                c[i]++;
            }
        }

        for (int i = 3; i <= 100000; i++) {
            c[i] += c[i - 1];
        }
        for(int k = 0; k < n; k++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println( c[r] - c[l-1]);
        }

    }
}
