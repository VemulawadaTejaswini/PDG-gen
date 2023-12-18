import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int MOD = 2019;
        int[] M = new int[N];
        M[0] = 1;
        for(int i=1;i<N;i++){
            M[i] = M[i-1] * 10;
            M[i] %= MOD;
        }
        long[] cnts = new long[2019];//0..2018 amari
        cnts[0] = 1;
        long sum = 0;
        int acc = 0;
        for(int i=0;i<N;i++){
            char keta = S.charAt(N-1-i);
            int k = keta-'0';
            int nowmod = k*M[i] % MOD;
            acc += nowmod;
            acc %= 2019;
            sum += cnts[acc];
            cnts[acc] ++;
        }
        System.out.println(sum);
    }

}
