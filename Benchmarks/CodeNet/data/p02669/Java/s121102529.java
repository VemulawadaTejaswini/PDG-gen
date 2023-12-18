import java.util.*;

public class Main {

    private static int A;
    private static int B;
    private static int C;
    private static int D;

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
           
            memo = new HashMap<>();
            long min = dfs(N);
            ans.append(min).append('\n');
        }

        System.out.print(ans);
    }


    private static long dfs(long n) {

        Long cached = memo.get(n);
        if (cached != null) {
            return cached;
        }

        if (n == 0) return 0;

        if (n == 1) return D;

        long l2 = n/2*2;
        long r2 = (n+1)/2*2;
        long l3 = n/3*3;
        long r3 = (n+2)/3*3;
        long l5 = n/5*5;
        long r5 = (n+4)/5*5;

        long min = 1_000_000_000_000_000_000L;
        if (n < 1_000_000_000) min = n*D;
        min = Math.min(min, Math.abs(l2-n)*D+A+dfs(l2/2));
        min = Math.min(min, Math.abs(r2-n)*D+A+dfs(r2/2));
        min = Math.min(min, Math.abs(l3-n)*D+B+dfs(l3/3));
        min = Math.min(min, Math.abs(r3-n)*D+B+dfs(r3/3));
        min = Math.min(min, Math.abs(l5-n)*D+C+dfs(l5/5));
        min = Math.min(min, Math.abs(r5-n)*D+C+dfs(r5/5));

        memo.put(n,min);

        return min;
    }
}
