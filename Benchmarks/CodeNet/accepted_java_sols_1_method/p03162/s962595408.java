import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] ai = new int[N];
        int[] bi = new int[N];
        int[] ci = new int[N];

        for (int i = 0; i < N; i++) {

            ai[i] = Integer.parseInt(sc.next());
            bi[i] = Integer.parseInt(sc.next());
            ci[i] = Integer.parseInt(sc.next());
        }

        sc.close();

//        int[] dp = new int[N+1];
        int[] aiDp = new int[N+1];
        int[] biDp = new int[N+1];
        int[] ciDp = new int[N+1];

//        dp[0] = Math.max(ai[0], Math.max(bi[0], ci[0]));
        aiDp[0] = ai[0];
        biDp[0] = bi[0];
        ciDp[0] = ci[0];

//      dp[1] = Math.max((ai[1] + Math.max(bi[0], ci[0])), Math.max((bi[1] + Math.max(ai[0], ci[0])), (ci[1] + Math.max(ai[0], bi[0]))));
//        aiDp[1] = ai[1] + Math.max(bi[0], ci[0]);
//        biDp[1] = bi[1] + Math.max(ai[0], ci[0]);
//        aiDp[1] = ci[1] + Math.max(ai[0], bi[0]);

        for (int i = 1; i < N; i++) {

            aiDp[i] = ai[i] + Math.max(biDp[i-1], ciDp[i-1]);
            biDp[i] = bi[i] + Math.max(aiDp[i-1], ciDp[i-1]);
            ciDp[i] = ci[i] + Math.max(aiDp[i-1], biDp[i-1]);
        }

        System.out.println(Math.max(aiDp[N-1], Math.max(biDp[N-1], ciDp[N-1])));

    }
}