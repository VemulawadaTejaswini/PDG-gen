import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
        if (n < 3) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (l[i] == l[j]) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (l[i] + l[j] > l[k] && l[i] + l[k] > l[j] && l[j] + l[k] > l[i] && l[i] != l[k] && l[j] != l[k]) {
//                        System.out.println(i + " " + j + " " + k);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}