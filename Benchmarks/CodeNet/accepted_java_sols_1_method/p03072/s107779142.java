import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cnt = 1;
        for (int i = 1; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cnt++;
            }
        }

        out.println(cnt);
    }
}
