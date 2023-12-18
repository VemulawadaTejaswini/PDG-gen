
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/13 8:06 下午
 */
public class Main {
    private static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1){
            System.out.println(0);
            return;
        }
        long ans = 2;
        long a = 17;
        long b = 17;
        long c = 64;
        for(int i = 3;i<=n;i++){
            ans = (10*ans + a + b)%MOD;
            a = (9*a + c)%MOD;
            b = (9*b + c)%MOD;
            c = (8*c)%MOD;
        }
        System.out.println(ans);
    }
}
