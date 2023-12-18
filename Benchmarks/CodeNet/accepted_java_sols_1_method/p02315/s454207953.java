

class Main {
    public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        // value, weight
        int[][] m = new int [N+1][2];
        for(int i=1; i<N+1; i++){
            m[i][0] = Integer.parseInt(sc.next());
            m[i][1] = Integer.parseInt(sc.next());
        }

        int[][] dp = new int[N+1][W+1];
        for(int ni=1; ni<N+1; ni++){
            for(int wi=1; wi<W+1; wi++){
                // System.out.println(wi - m[ni][1]);
                int useNiObject = wi - m[ni][1] >= 0 ? dp[ni-1][wi - m[ni][1]] + m[ni][0] : -1;
                dp[ni][wi] = Math.max(dp[ni-1][wi], useNiObject );
            }
        }
        System.out.println(dp[N][W]);
        sc.close();
    }
}
