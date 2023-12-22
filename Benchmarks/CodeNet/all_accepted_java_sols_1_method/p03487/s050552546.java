import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        long ans = 0;
        int cnt = 1;
        int num = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] == num) {
                cnt++;
            } else {
                if (cnt >= num)
                    ans += cnt - num;
                else
                    ans += cnt;

                num = a[i];
                cnt = 1;
            }
        }

        if (cnt >= num)
            ans += cnt - num;
        else
            ans += cnt;

        System.out.println(ans);
    }
}