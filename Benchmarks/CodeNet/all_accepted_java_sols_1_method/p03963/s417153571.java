import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long ans = K;
        if(N == 1){
            ans = K;
            System.out.println(ans);
            return;
        }
        for(int i = 1; i < N; i++){
            ans *= K - 1;
        }
        System.out.println(ans);
    }
}