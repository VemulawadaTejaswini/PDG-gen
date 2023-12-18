import java.util.*;

public class Main {

    private static int A;
    private static int B;
    private static int C;
    private static int D;

    private static long min;
    private static Map<Long,Long> memo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

            min = Long.MAX_VALUE;
            memo = new HashMap<>();
            dfs(N, 0);
            ans.append(min).append('\n');
        }

        System.out.print(ans);
    }


    private static void dfs(long n, long cost) {

        Long cached = memo.get(n);
        if (cached != null && cost >= cached) {
            return;
        }

        if (n == 0) {
            min = Math.min(min,cost);
            memo.put(n,min);
            return;
        }

        if (n == 1) {
            min = Math.min(min,cost+D);
            memo.put(n,min);
            return;
        }

        memo.put(n,cost);

        if (n%2 == 0) {
            dfs(n/2, cost+A);
        } else {
            dfs(n-n%2, cost+D*(n%2));
            dfs(n+(2-n%2), cost+D*(2-n%2));
        }

        if (n%3 == 0) {
            dfs(n/3, cost+B);
        } else {
            dfs(n-n%3, cost+D*(n%3));
            dfs(n+(3-n%3), cost+D*(3-n%3));
        }

        if (n%5 == 0) {
            dfs(n/5, cost+C);
        } else {
            dfs(n-n%5, cost+D*(n%5));
            dfs(n+(5-n%5), cost+D*(5-n%5));
        }
    }
}
