import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        long ans = 0;
        int prev = A[0];
        for (int i = 1; i < N; i++) {
            if (prev <= A[i]) {
                prev = A[i];
            } else {
                ans += prev-A[i];
            }
        }

        System.out.println(ans);
    }
}
