import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        double INF = Double.MAX_VALUE;
        double EPS = (double)1e-9;

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[] a = new int[n+1];
            for(int i=1; i<=n; i++) a[i] = sc.nextInt();
            double b = sc.nextDouble();
            int r = sc.nextInt();
            double v = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble();

            double[][] dp = new double[n+1][n+1];
            for(int i=0; i<=n; i++) Arrays.fill(dp[i], INF);
            dp[0][0] = 0.0;

            for(int i=1; i<=n; i++){
                double time1 = 0.0;
                for(int j=0; j<a[i]; j++){
                    if(j>=r) time1 += 1.0/(v - e * (j-r));
                    else time1 += 1.0/(v - f * (r-j));
                }
                dp[0][i] = time1;
                dp[1][i] = dp[0][i] + b;
            }

            for(int i=2; i<n; i++){//テ」ツつソテ」ツつ、テ」ツδ、テ・ツ、ツ嘉」ツ?暗」ツつ凝・ツ崢榲ヲツ閉ー
                for(int j=0; j<=n; j++){//テァツ崢ョテァツ堋?・ツ慊ー
                    for(int l=0; l<=j; l++){//テ・ツ?コテァツ卍コテ・ツ慊ー
                        double time = 0.0;
                        for(int k=0; k+a[l]<a[j]; k++){
                            if(k>=r) time += 1.0/(v - e * (k-r));
                            else time += 1.0/(v - f * (r-k));
                            
                        }
                        //System.out.println("time: "+time+" a[l]: "+a[l]+" a[j]: "+a[j]+" i: "+i);
                        
                        double d = dp[i-1][l];
                        if(d==INF) continue;
                        dp[i][j] = Math.min(dp[i][j], d + time + b);

                        time = 0.0;
                        for(int k=0; k+a[j]<a[n]; k++){
                            if(k>=r) time += 1.0/(v - e * (k-r));
                            else time += 1.0/(v - f * (r-k));
                            
                        }

                        dp[i][n] = Math.min(dp[i][n], dp[i][j] + time);
                    }
                }
            }

            //for(int i=0; i<=n; i++) System.out.println(Arrays.toString(dp[i]));

            double min = INF;
            for(int i=0; i<n; i++) min = Math.min(min, dp[i][n]);
            System.out.println(min);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
} 