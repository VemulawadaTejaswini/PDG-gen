import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        String T = sc.next();

        int[] point = new int[N];
        for (int i=0;i<N;i++) {
            if (T.charAt(i)=='r') point[i] = P;
            else if (T.charAt(i)=='s') point[i] = R;
            else if (T.charAt(i)=='p') point[i] = S;
        }
        boolean[] win_flag = new boolean[N];

        long ans = 0;
        for (int i=0;i<N;i++) {
            if (i>=K && T.charAt(i)==T.charAt(i-K) && win_flag[i-K]) continue;
            else {
                ans += point[i];
                win_flag[i] = true;
            }
        }
        System.out.println(ans);
    }
}