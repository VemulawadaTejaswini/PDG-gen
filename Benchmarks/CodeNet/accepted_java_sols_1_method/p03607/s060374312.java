import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int now = a[i];
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] == now) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            if (count % 2 == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}