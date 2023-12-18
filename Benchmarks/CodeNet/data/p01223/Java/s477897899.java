import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int TC = in.nextInt();
        while (TC-- > 0) {
            int N = in.nextInt();
            int prev = -99999;
            int down = 0;
            int climb = 0;
            for (int i = 0; i < N; i++) {
                int n = in.nextInt();
                if (i > 0) {
                    if (prev < n) {
                        climb = Math.max(climb, n - prev);
                    } else if (prev > n) {
                        down = Math.min(down, n - prev);
                    }
                }
                prev = n;
            }
            System.out.println(climb + " " + (down * -1));
        }
    }
}

