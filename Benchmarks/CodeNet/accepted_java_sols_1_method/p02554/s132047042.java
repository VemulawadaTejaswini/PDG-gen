import java.util.Scanner;

public class Main {
    static final int NUMBER = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 全体の場合の数（条件2, 3を無視）
        long ans = 1;
        for(int i=0; i<n; i++) {
            ans *= 10;
            ans %= NUMBER;
        }

        // 0が無い数列の個数
        long no0 = 1;
        for(int i=0; i<n; i++) {
            no0 *= 9;
            no0 %= NUMBER;
        }

        // 9が無い数列の個数
        long no9 = no0;

        // 0と9の両方が無い数列の個数
        long no09 = 1;
        for(int i=0; i<n; i++) {
            no09 *= 8;
            no09 %= NUMBER;
        }

        ans = ans - no0 - no9 + no09;
        while(ans < 0) {
            ans += NUMBER;
        }
        ans %= NUMBER;
        System.out.println(ans);
    }
}
