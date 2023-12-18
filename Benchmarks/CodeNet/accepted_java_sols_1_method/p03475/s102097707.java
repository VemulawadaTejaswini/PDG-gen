import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];

        for (int i = 0; i < n - 1; i++){
            c[i] = scanner.nextInt();
            s[i] = scanner.nextInt();
            f[i] = scanner.nextInt();
        }
        c[n - 1] = 0; s[n - 1] = 0; f[n - 1] = 1;
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = i; j < n; j++) {
                if (t <= s[j]) t += (s[j] - t) + c[j];
                else t += (f[j] - (t - s[j]) % f[j]) % f[j] + c[j];
            }
            System.out.println(t);
        }

    }
}
