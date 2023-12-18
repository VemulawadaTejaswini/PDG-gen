import java.util.*;

public class Main {

    static long mod = 998244353;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        long[] next = new long[s+1];
        next[0] = 1;



        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            long[] prev = next;
            next = new long[s+1];

            for(int j=0; j<=s; j++) {
                next[j] += prev[j] *2;
                next[j] %= mod;
                int num = j + a;
                if(num > s) continue;
                next[num] += prev[j];
                next[num] %= mod;
            }
        }

        System.out.println(next[s]);
    }



}
