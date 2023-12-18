import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int INF = Integer.MAX_VALUE;

        while(true){
            int[] ab = new int[2];
            ab[0] = sc.nextInt();
            ab[1] = sc.nextInt();
            int d = sc.nextInt();
            if(ab[0]==0 && ab[1]==0 && d==0) break;

            int[][] cnt = new int[100001][3];
            for(int i=1; i<=100000; i++) Arrays.fill(cnt[i], INF);
            for(int i=0; i<=100000; i++){
                //if(cnt[i][0]==INF) continue;
                for(int j=0; j<2; j++){
                    if(i-ab[j]<0 || cnt[i-ab[j]][0]==INF) continue;
                    if(cnt[i][0]>cnt[i-ab[j]][0]+1){
                        //System.out.println("ppoyo");
                        cnt[i][0] = cnt[i-ab[j]][0]+1;
                        if(j==0){
                            cnt[i][1] = cnt[i-ab[j]][1] + 1;
                            cnt[i][2] = cnt[i-ab[j]][2];
                        }else{
                            cnt[i][1] = cnt[i-ab[j]][1];
                            cnt[i][2] = cnt[i-ab[j]][2] + 1;
                        }
                    }else if(cnt[i][0]==cnt[i-ab[j]][0]+1){
                        int n1 = (cnt[i-ab[j]][(j+1)%2]+1) * ab[j] + cnt[i-ab[j]][(j+2)%2] * ab[(j+1)%2];
                        int n2 = cnt[i][1] * ab[0] + cnt[i][2] * ab[1];
                        if(n1<n2){
                            cnt[i][0] = cnt[i-ab[j]][0]+1;
                            if(j==0){
                                cnt[i][1] = cnt[i-ab[j]][1] + 1;
                                cnt[i][2] = cnt[i-ab[j]][2];
                            }else{
                                cnt[i][1] = cnt[i-ab[j]][1];
                                cnt[i][2] = cnt[i-ab[j]][2] + 1;
                            }
                        }
                    }
                }
            }

            int minx = INF;
            int miny = INF;

            for(int i=d; i<=100000; i++){
                int n1 = i;
                int n2 = i-d;

                if(cnt[n1][0]==INF || cnt[n2][0]==INF) continue;
                if(minx==INF || cnt[n1][0]+cnt[n2][0]<minx+miny){
                    minx = cnt[n1][1] + cnt[n2][1];
                    miny = cnt[n1][2] + cnt[n2][2];
                }else if(cnt[n1][0]+cnt[n2][0]==minx+miny){
                    int nn1 = (cnt[n1][1]+cnt[n2][1]) * ab[0] + (cnt[n1][2]+cnt[n2][2]) * ab[1];
                    int nn2 = minx * ab[0] + miny * ab[1];
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