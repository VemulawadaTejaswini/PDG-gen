import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int b[] = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                int a = Integer.parseInt(sc.next());
                sum += a * b[j];
            }
            sum += C;
            if (sum > 0) {
                ++ans;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}