import java.util.*;

class Main{

    int[][] cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE;
        int max = 1000000;
        cnt = new int[max+1][2];

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            if(a==0 && b==0 && d==0) break;

            for(int i=1; i<=max; i++) Arrays.fill(cnt[i], INF);
            for(int i=0; i<=max; i++){
                if(i-a>=0 && cnt[i-a][0]!=INF){
                    if(cnt[i][0]==INF || cnt[i][0]+cnt[i][1]>cnt[i-a][0]+cnt[i-a][1]+1){
                        cnt[i][0] = cnt[i-a][0] + 1;
                        cnt[i][1] = cnt[i-a][1];
                    }else if(cnt[i][0]+cnt[i][1]==cnt[i-a][0]+cnt[i-a][1]+1){
                        long n1 = (cnt[i-a][0]+1) * a + cnt[i-a][1] * b;
                        long n2 = cnt[i][0] * b + cnt[i][1] * a;
                        if(n1>=n2) continue;
                        cnt[i][0] = cnt[i-a][0] + 1;
                        cnt[i][1] = cnt[i-a][1];
                    }
                }
                if(i-b>=0 && cnt[i-b][0]!=INF){
                    if(cnt[i][0]==INF || cnt[i][0]+cnt[i][1]>cnt[i-b][0]+cnt[i-b][1]+1){
                        cnt[i][0] = cnt[i-b][0];
                        cnt[i][1] = cnt[i-b][1] + 1;
                    }else if(cnt[i][0]+cnt[i][1]==cnt[i-b][0]+cnt[i-b][1]+1){
                        long n1 = (cnt[i-b][0]+1) * a + cnt[i-b][1] * b;
                        long n2 = cnt[i][0] * b + cnt[i][1] * a;
                        if(n1>=n2) continue;
                        cnt[i][0] = cnt[i-b][0];
                        cnt[i][1] = cnt[i-b][1] + 1;
                    }
                }
            }

            int minx = INF;
            int miny = INF;

            for(int i=d; i<=max; i++){
                int n1 = i;
                int n2 = i-d;

                if(cnt[n1][0]==INF || cnt[n2][0]==INF) continue;

                int x = cnt[n1][0] + cnt[n2][0];
                int y = cnt[n1][1] + cnt[n2][1];
                if(minx==INF || x+y<minx+miny){
                    minx = x;
                    miny = y;
                }else if(x+y==minx+miny){
                    long nn1 = x * a + y * b;
                    long nn2 = minx * a + miny * b;
                    if(nn1<nn2){
                        minx = x;
                        miny = y;
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