import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), K = in.nextInt();
        boolean[] hasCandies = new boolean[N];
        for (int i = 0; i < K; i++) {
            int M = in.nextInt();
            for (int j = 0; j < M; j++) {
                hasCandies[in.nextInt() - 1] = true;
            }
        }
        int res = 0;
        for (boolean b : hasCandies) {
            if (!b) {
                res++;
            }
        }
        System.out.println(res);
    }
}
