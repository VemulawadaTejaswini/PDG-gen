import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] == 0) {
                continue;
            }
            int max = h[i];
            for (int j = 0; j < max; j++) {
                ans++;
                for (int k = i; k < n; k++) {
                    if (h[k] > 0) {
                        h[k]--;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
