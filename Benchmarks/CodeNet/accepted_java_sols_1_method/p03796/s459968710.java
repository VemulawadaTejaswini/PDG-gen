import java.util.*;

/**
 * Created by Seiya on 2016/10/16.
 */

public class Main {

    static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long ans = 1;
        for (int i = 1; i <= N  ; i++) {
            ans = ans * i;
            ans = ans % MOD;
        }

        System.out.println(ans);


    } // mainMethod



} // MainClass
