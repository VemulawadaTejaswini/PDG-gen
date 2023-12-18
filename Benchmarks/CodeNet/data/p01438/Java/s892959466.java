import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[][] dp = new int[1<<17][2];

            int idx = 0;
            for(int i=0; i<n; i++){
                int m = sc.nextInt();
                int L = sc.nextInt();
                for(int j=0; j<m; j++){
                    int s = sc.nextInt()-6;
                    int e = sc.nextInt()-6;
                    int bit = 0;
                    for(int k=s; k<=e; k++) bit ^= (1<<k);
                    for(int k=0; k<(1<<17); k++){
                        boolean boo = true;
                        for(int l=s; l<=e; l++){
                            if((k^(1<<l))==0){
                                boo = false;
                                break;
                            }
                        }
                        if(!boo) break;
                        
                        int kk = k;
                        for(int l=s+1; l<e; l++){
                            if((kk^(1<<l))>0) kk ^= (1<<l);
                        }
                        //System.out.println(s+" "+e+" bit: "+Integer.toBinaryString(bit)+" k: "+Integer.toBinaryString(kk));
                        dp[k][idx] = Math.max(dp[k][1-idx], L + dp[kk][1-idx]);
                    }
                    idx = 1-idx;
                }
            }

            idx = 1-idx;
            int max = 0;
            for(int i=0; i<(1<<17); i++){
                //if(max<dp[i][idx]) System.out.println(Integer.toBinaryString(i));
                max = Math.max(max, dp[i][idx]);
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}