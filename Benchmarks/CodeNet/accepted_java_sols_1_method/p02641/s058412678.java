import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println(X);
            return;
        }
        List<Integer> ps = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            ps.add(sc.nextInt());
        }
        Collections.sort(ps);

        int min = Integer.MAX_VALUE;
        int ans = -1;

        int st = ps.get(0) - 1;
        st = X < st ? X : st;
        int en = ps.get(ps.size() - 1) + 1;
        en = en < X ? X : en;
        for (int i = st; i <= en; i++) {
            if (!ps.contains(i)) {
                int res = Math.abs(X - i);
                if (res < min) {
                    min = res;
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}