import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int ans = 0;

        if (B <= C || D <= A) {
            // not overlay
        } else if ((B > C) && (A < C)) {
            ans = B <= D ? B - C : D - C;
        } else {
            ans = D <= B ? D - A : B - A;
        }

        System.out.println(ans);
    }
}