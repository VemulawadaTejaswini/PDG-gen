import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int K = sc.nextInt(), S = sc.nextInt();
                        int ans = 0;
                        for (int i = 0; i <= K; i++) {
                                for (int j = 0; j <= K; j++) {
                                        int k = S - i - j;
                                        if (0 <= k && k <= K) {
                                                ans++;
                                        }
                                }
                        }
                        System.out.println(ans);
                }
        }
}