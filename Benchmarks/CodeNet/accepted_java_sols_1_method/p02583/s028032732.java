import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] == a[i]) continue;
                for (int k = j + 1; k < n; k++) {
                    if (a[k] == a[j]) continue;
                    if (a[i] + a[j] > a[k]) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
