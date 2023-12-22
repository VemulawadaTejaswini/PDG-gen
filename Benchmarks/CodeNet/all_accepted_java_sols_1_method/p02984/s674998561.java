import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dam = new int[n + 1];
        int[] rain = new int[n + 1];

        for (int i = 0; i < n; ++i) {
            dam[i] = sc.nextInt();
        }
        dam[n] = dam[0];

        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                rain[0] += dam[i];
            } else {
                rain[0] -= dam[i];
            }
        }

        for (int i = 1; i < n; ++i) {
            rain[i] = dam[i - 1] * 2 - rain[i - 1];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(rain[i]);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
