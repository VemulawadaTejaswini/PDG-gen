
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[] c = new int[N];
        int[] t = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        int ans = -1;
        for (int i = 0; i < N; i++) {
            if (t[i] <= T) {
                if (ans == -1 || ans > c[i])
                    ans = c[i];
            }
        }
        if (ans == -1)
            System.out.println("TLE");
        else
            System.out.println(ans);

    }

}
