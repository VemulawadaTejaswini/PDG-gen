import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int[] X = new int[N];
        for (int i=0;i<N;i++) {
            X[i] = Integer.parseInt(sc.next());
        }
        long ans = 0L;
        for (int i=0;i<N-1;i++) {
            ans += Math.min((long)A*(X[i+1]-X[i]), B);
        }
        System.out.println(ans);
    }
}
