import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int a = sc.nextInt();
                h.put(a, 1);
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (h.get(i) == null) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}