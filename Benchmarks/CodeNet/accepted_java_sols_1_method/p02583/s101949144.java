
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        long[] l = new long[n];
        for (int i = 0; i < n; i++) {
            l[i] = Long.parseLong(scan.next());
        }
        scan.close();

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (l[i] == l[j]) {
                        continue;
                    }
                    if (l[j] == l[k]) {
                        continue;
                    }
                    if (l[k] == l[i]) {
                        continue;
                    }

                    long[] length = { l[i], l[j], l[k] };
                    Arrays.sort(length);
                    if (length[0] + length[1] > length[2]) {
                        ans++;
                    }

                }
            }
        }

        System.out.println(ans);
    }
}
