import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            while (A[i] % 2 == 0) {
                A[i] /= 2;
                cnt++;
            }
            ans = Math.min(ans, cnt);
        }
        System.out.println(ans);
    }
}