import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = 0;
        int maxnum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (max < A[i]) {
                max = A[i];
                maxnum = i;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (i == maxnum) ans += (A[i] / 2);
            else ans += A[i];
        }
        System.out.println(ans);
        sc.close();
    }
}