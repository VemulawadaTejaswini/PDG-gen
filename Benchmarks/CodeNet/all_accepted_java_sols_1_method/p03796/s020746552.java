import java.util.*;
public class Main {
    public static void main(String[]_) throws Exception {
        Scanner s=new Scanner(System.in);
        // 階乗
        long a=1;
        long N=s.nextLong();
        for(int i=2;i<=N;i++){ // 1はいらない
            a*=i;
            a%=1e9+7; // 1e9 = 1 x 10^9
        }
        System.out.println(a);
    }
}
