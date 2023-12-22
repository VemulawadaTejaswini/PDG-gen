import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = Integer.parseInt(s.next());
        int[] h = new int[N];

        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(s.next());
        }

        int ans = 0;
        int active = 0;

        for (int i = 0; i < N; i++) {
            if (active >= h[i]) {
                active = h[i];
            } else {
                ans += h[i] - active;
                active = h[i];
            }
        }
        System.out.println(ans);
    }
}