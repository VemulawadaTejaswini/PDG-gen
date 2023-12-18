import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long mod = (long)Math.pow(10,9) + 7;
        long pow = 1;
        long n = sc.nextLong();
        for(int i = 1; i <= n; i++){
            pow *= i;
            pow %= mod;
        }
        System.out.println(pow);
    }
}
