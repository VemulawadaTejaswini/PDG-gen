import java.util.Scanner;

class Main{
    static int N, W;

    static int get(int[][] dp, int n, int w, int a){
        if(n<0 || n>=N || w<0 || w>W)
            return 0;
        else
            return dp[n][w] + a;
    }

    static int max(int a, int b, int c){
        if(a>b && a>c)
            return a;
        else if(b>c)
            return b;
        else 
            return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        int[][] dp = new int[N][W+1];

        int tv = sc.nextInt();
        int tw = sc.nextInt();
        for(int w=0; w<=W; w++){
            if(w<tw)
                dp[0][w] = 0;
            else
                dp[0][w] = tv;
        }

        for(int n=1; n<N; n++){
            tv = sc.nextInt();
            tw = sc.nextInt();
            for(int w=0; w<=W; w++){
                dp[n][w] = max(get(dp,n-1,w-tw,tv), get(dp,n-1,w,0), get(dp,n,w-1,0));
            }
        }
        System.out.println(dp[N-1][W]);

        // for(int[] arr: dp) {
        //     for(int i: arr){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }
    }
}
