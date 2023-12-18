import java.util.*;

class Main {
        public static void main(String args[]) {
                try(Scanner sc = new Scanner(System.in)) {
                        int N = sc.nextInt();
                        int min = 1 << 20;
                        int ans = -1;
                        for (int i = 0; i < N; i++) {
                                int now = sc.nextInt();
                                ans = Math.max(ans, now - min);
                                min = Math.min(min, now);
                        }
                        System.out.println(ans);
                }
        }
}