import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String str = sc.next();

        int[] s = new int[N+1];
        for (int i = 0; i < N; ++i) {
            if (i != N-1 && str.charAt(i) == 'A' && str.charAt(i+1) == 'C') {
                s[i+1] = s[i] + 1;
            } else {
                s[i+1] = s[i];
            }
        }

        for (int i = 0; i < Q; ++i) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            System.out.println(s[r-1] - s[l-1]);
        }
    }
}