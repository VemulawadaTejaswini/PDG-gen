import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long ans = 0;
        if(K==0) {
            System.out.println(N*N);
            return;
        }
        for(int i = (int)K+1; i<=N; i++) {
            System.err.println((N)/i * (i-K) +" , "+ Math.max(N%i-(K-1), 0));
            ans += (N)/i * (i-K) + Math.max(N%i-(K-1), 0);
        }
        System.out.println(ans);
    }
}