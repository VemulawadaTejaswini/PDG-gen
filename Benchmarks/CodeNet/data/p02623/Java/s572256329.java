import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();

        long[] arr = new long[n+m];

        for (int i=0; i<n+m; i++) arr[i] = sc.nextLong();

        Arrays.sort(arr);

        long sum = 0;

        int cnt = 0;
        int i = 0;

        while (sum < k) {
            sum += arr[i];
            i++;
            cnt++;
        }

        if (k<sum) cnt--;

        System.out.print(cnt);

    }
}
