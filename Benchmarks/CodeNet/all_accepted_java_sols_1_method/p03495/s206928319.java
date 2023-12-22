import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] count = new int[200001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        Arrays.sort(count);
        int ans = 0;
        for (int i = 200000 - k; i >= 0; i--) {
            if (count[i] != 0)
                ans += count[i];
            else
                break;
        }
        System.out.println(ans);
    }
}
