import java.util.Scanner;

public class Main {

    static long X;
    static long K;
    static long D;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        X = sc.nextLong();
        K = sc.nextLong();
        D = sc.nextLong();

        Long min = calc(X,K,D,K/2);
        long ans = 0l;
        for(long i=0l; i<K; i++){
            ans = calc(X,K,D,i);
            if(ans < min){
                min = ans;
            }
        }
        System.out.println(min);
    }
    
    static long calc(long X, long K, long D,long i){
        return Math.abs(X-(((K-i)*D)-i*D));
    }
}
