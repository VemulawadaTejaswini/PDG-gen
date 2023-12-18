import java.util.*;

public class Main {
    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 配列内の最小値とその番号を調べる
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                minIndex = i;
            }
        }

        int cnt = 0;
        int tmp = 0;
        for (int l = minIndex-1; l >= 0; l--) {
            if (a[minIndex] == a[l])
                continue;
            else {
                cnt++;
                l -= k-2;
                if (l-1 < 0)
                    tmp = Math.abs(l);
            }
        }

        for (int r = minIndex+1+tmp; r < n; r++) {
            if (a[minIndex] == a[r])
                continue;
            else {
                cnt++;
                r += k-2;
            }
        }

        System.out.println(cnt);
    }
}