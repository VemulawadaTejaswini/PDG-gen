import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        long ans = 0;
        // i : 取る個数
        for (int i = 1; i < k + 1; i++) {
            int get = i;
            if (get >= n) {
                get = n;
            }
            int have[] = new int[get];

            // 左からj個取る
            for (int j = 1; j <= get; j++) {
                int pos = 0;
                for (int m = 0; m < j; m++) {
                    have[pos] = v[m];
                    pos++;
                }
                for (int m = 0; m < get - j; m++) {
                    have[pos] = v[n - 1 - m];
                    pos++;
                }
                Arrays.sort(have);
                for (int m = 0; m < k - get; m++) {
                    if (m == get) {
                        break;
                    }
                    if (have[m] <= 0) {
                        have[m] = 0;
                    } else {
                        break;
                    }
                }
                long tmpans = 0;
                for (int m = 0; m < get; m++) {
                    tmpans += have[m];
                }
                if (ans < tmpans) {
                    ans = tmpans;
                }
            }

        }
        System.out.println(ans);

        sc.close();
    }
}