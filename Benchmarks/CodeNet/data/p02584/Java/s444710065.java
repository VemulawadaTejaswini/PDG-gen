import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long P;
        long W;
        long def = X/D;
        long Q = K-def;
        if(K > def){
            long S = X - (def*D);
            long A = Math.abs(S-D);
            if(S<A){
                W = S;
                P = A;
            }else{
                W = A;
                P = S;
            }
            if(Q%2 == 1){
                System.out.println(Math.abs(P-D));
            }else{
                System.out.println(W);
            }
        }else{
            System.out.println(X-(K*D));
        }
        
    }
}
