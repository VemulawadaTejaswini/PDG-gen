import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] count = new int[1000005];
        for (int i = 0; i < 1000005; i++) count[i] = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            count[arr[i]]++;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (count[arr[i]] > 1) continue;
            if (count[1] > 0 && arr[i] != 1) continue;
            if (count[1] > 1 && arr[i] == 1) continue;
            ans++;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    if (count[j] > 0) {
                        ans--;
                        break;
                    }
                    if (count[arr[i] / j] > 0) {
                        ans--;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
