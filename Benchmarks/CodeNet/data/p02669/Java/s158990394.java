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

        int[] div = new int[] {2,3,5};
        int[] divCost = new int[] {A,B,C};

        for (int i = 0; i < 3; i ++) {
            {
                long diffCost = (n%div[i])*D;
                long divLen = n/div[i]*div[i];
                if (divLen <= divCost[i]) {
                    diffCost += Math.min(divCost[i],divLen*D);
                } else {
                    diffCost += divCost[i];
                }
                dfs(n/div[i], cost+diffCost);
            }
            {
                long diffCost = (div[i]-(n%div[i]))*D;
                long divLen = (n+div[i])/div[i]*(div[i]-1);
                if (divLen <= divCost[i]) {
                    diffCost += Math.min(divCost[i],divLen*D);
                } else {
                    diffCost += divCost[i];
                }
                dfs((n+div[i])/div[i], cost+diffCost);
            }
        }


        /*
        {
            long diffCost = (n%2)*D;
            long divLen = n/2;
            if (divLen <= A) {
                diffCost += Math.min(A,divLen*D);
            } else {
                diffCost += A;
            }
            dfs(n/2, cost+diffCost);
        }
        {
            long diffCost = (n%2)*D;
            long divLen = (n+2)/2;
            if (divLen <= A) {
                diffCost += Math.min(A,divLen*D);
            } else {
                diffCost += A;
            }
            dfs((n+2)/2, cost+diffCost);
        }

        {
            long diffCost = (n%3)*D;
            long divLen = n/3*2;
            if (divLen <= B) {
                diffCost += Math.min(B,divLen*D);
            } else {
                diffCost += B;
            }
            dfs(n/3, cost+diffCost);
        }
        {
            long diffCost = (3-(n%3))*D;
            long divLen = (n+3)/3*2;
            if (divLen <= B) {
                diffCost += Math.min(B,divLen*D);
            } else {
                diffCost += B;
            }
            dfs((n+3)/3, cost+diffCost);
        }

        {
            long diffCost = (n%5)*D;
            long divLen = n/5*4;
            if (divLen <= C) {
                diffCost += Math.min(C,divLen*D);
            } else {
                diffCost += C;
            }
            dfs(n/5, cost+diffCost);
        }
        {
            long diffCost = (5-(n%5))*D;
            long divLen = (n+5)/5*4;
            if (divLen <= C) {
                diffCost += Math.min(C,divLen*D);
            } else {
                diffCost += C;
            }
            dfs((n+5)/5, cost+diffCost);
        }
        */
    }
}
