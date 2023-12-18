import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int T = sc.nextInt();
            int L = sc.nextInt();
            int B = sc.nextInt();
            if(N==0 && T==0 && L==0 && B==0) break;
            int[] square = new int[N+1];
            for(int i=0; i<L; i++) square[sc.nextInt()] = 1;
            for(int i=0; i<B; i++) square[sc.nextInt()] = 2;

            double[][] dp = new double[N+1][T+1];
            dp[0][0] = 1;
            for(int j=0; j<T; j++){
                for(int i=0; i<N; i++){
                    for(int s=1; s<=6; s++){
                        int idx = 1;
                        int num = i+s;
                        if(square[i]==1) idx = 2;
                        if(i+s>N) num = 2*N-(i+s);

                        if(square[num]==2 && j+idx<=T){
                            dp[0][j+idx] += dp[i][j] * 1.0/6;
                        }else if(j+idx<=T){
                            dp[num][j+idx] += dp[i][j] * 1.0/6;
                        }
                    }
                }
            }

            double goal = 0.0;
            for(int i=0; i<=T; i++) goal += dp[N][i];
            System.out.println(goal);

        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}