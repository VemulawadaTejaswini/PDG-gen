import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE;

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            if(a==0 && b==0 && d==0) break;

            int max = 500000;

            int[][] cnt = new int[max+1][3];
            for(int i=1; i<=max; i++) Arrays.fill(cnt[i], INF);
            for(int i=0; i<=max; i++){
                for(int j=0; j<2; j++){
                    if(i-a>=0 && cnt[i-a][0]!=INF){
                        if(cnt[i][0]>cnt[i-a][0]+1){
                            cnt[i][0] = cnt[i-a][0] + 1;
                            cnt[i][1] = cnt[i-a][1] + 1;
                            cnt[i][2] = cnt[i-a][2];
                        }else if(cnt[i][0]==cnt[i-a][0]+1){
                            long n1 = (cnt[i-a][1]+1) * a + cnt[i-a][2] * b;
                            long n2 = cnt[i][1] * b + cnt[i][2] * a;
                            if(n1>=n2) continue;
                            cnt[i][0] = cnt[i-a][0] + 1;
                            cnt[i][1] = cnt[i-a][1] + 1;
                            cnt[i][2] = cnt[i-a][2];
                        }
                    }
                    if(i-b>=0 && cnt[i-b][0]!=INF){
                        if(cnt[i][0]>cnt[i-b][0]+1){
                            cnt[i][0] = cnt[i-b][0] + 1;
                            cnt[i][1] = cnt[i-b][1];
                            cnt[i][2] = cnt[i-b][2] + 1;
                        }else if(cnt[i][0]==cnt[i-b][0]+1){
                            long n1 = (cnt[i-b][1]+1) * a + cnt[i-b][2] * b;
                            long n2 = cnt[i][1] * b + cnt[i][2] * a;
                            if(n1>=n2) continue;
                            cnt[i][0] = cnt[i-b][0] + 1;
                            cnt[i][1] = cnt[i-b][1];
                            cnt[i][2] = cnt[i-b][2] + 1;
                        }
                    }
                }
            }

            int minx = INF;
            int miny = INF;

            for(int i=d; i<=max; i++){
                int n1 = i;
                int n2 = i-d;

                if(cnt[n1][0]==INF || cnt[n2][0]==INF) continue;
                if(minx==INF || cnt[n1][0]+cnt[n2][0]<minx+miny){
                    minx = cnt[n1][1] + cnt[n2][1];
                    miny = cnt[n1][2] + cnt[n2][2];
                }else if(cnt[n1][0]+cnt[n2][0]==minx+miny){
                    long nn1 = (cnt[n1][1]+cnt[n2][1]) * a + (cnt[n1][2]+cnt[n2][2]) * b;
                    long nn2 = minx * a + miny * b;
                    if(nn1<nn2){
                        minx = cnt[n1][1] + cnt[n2][1];
                        miny = cnt[n1][2] + cnt[n2][2];
                    }
                }
            }

            System.out.println(minx+" "+miny);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}