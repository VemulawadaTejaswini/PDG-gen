import java.util.*;

public class Main {
    private static long MOD = 998244353;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        long[] now = new long[S+1];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        now[0] = 1;
        //mps.get(A[0]).put(1,1L);//1 ko de 1 toori
        for(int i=0;i<N;i++){
            long[] addArr = new long[S+1];
            for(int j=S;j>=0;j--){
                addArr[j] += now[j];
                if(j+A[i] > S){continue;}
                addArr[j+A[i]] += now[j];
            }
            for(int j=0;j<=S;j++){
                now[j] += addArr[j];
                now[j] %= MOD;
            }
        }
        System.out.println(now[S]);
    }


}
