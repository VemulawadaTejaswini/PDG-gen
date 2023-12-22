import java.util.*;

public class Main {
    static long[][] kyuyu;
    static long[][] dist;
    static int L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int M = sc.nextInt();
        L = sc.nextInt();
        kyuyu = new long[N][N];
        dist = new long[N][N];
        for(int i=0;i<N;i++){
            Arrays.fill(kyuyu[i], Integer.MAX_VALUE);
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        for(int i=0;i<M;i++){
            int A=sc.nextInt()-1;
            int B=sc.nextInt()-1;
            int C=sc.nextInt();
            if(C <= L){
//                kyuyu[A][B]=0;
//                kyuyu[B][A]=0;
                dist[A][B]=C;
                dist[B][A]=C;
            }else{
                kyuyu[A][B]=Integer.MAX_VALUE;
                kyuyu[B][A]=Integer.MAX_VALUE;
                dist[A][B]=Integer.MAX_VALUE;
                dist[B][A]=Integer.MAX_VALUE;
            }
        }
        //System.out.println(map);
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    dist[j][k] = Math.min( dist[j][i] + dist[i][k], dist[j][k]);
                    if(dist[j][k] <= L){
                        kyuyu[j][k] = 1;
                    }
                }
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    kyuyu[j][k] = Math.min(kyuyu[j][i] + kyuyu[i][k] , kyuyu[j][k]);
                }
            }
        }
        //System.out.println(fuelMap);
        int Q = sc.nextInt();
        for(int q=0;q<Q;q++){
            int s=sc.nextInt()-1;
            int t=sc.nextInt()-1;
            if(kyuyu[s][t] == Integer.MAX_VALUE) {
                System.out.println(-1);
            }else{
                System.out.println(kyuyu[s][t] - 1);
            }
        }
    }



}
