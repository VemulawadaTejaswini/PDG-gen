import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K = sc.nextLong();
        long D = sc.nextLong();
        long def = X/D;
        long Q = K-def;
        if(K > def){
            long S = X - (def*D);
            long A = Math.abs(S-D);
        
            if(Q%2 != 0){
                System.out.println(Math.abs(A-D));
            }else{
                System.out.println(A);
            }
        }else{
            System.out.println(X-(def*D));
        }
        
    }
}
