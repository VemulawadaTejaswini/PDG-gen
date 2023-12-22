import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println( solve(N) );
    }

    private static int solve(long N) {
        // Nがさほど大きくないので sqrt(N)の範囲で因数を探し
        // F(factor, N/factor)してminを探す
        int max = (int)Math.ceil(Math.sqrt(N));

        // 2/maxにできるだろうけど面倒くさいしいいよね...
        int min = 10;
        for (int i = 1; i <= max; i++) {
            if( N % i == 0 ) {
                min = Math.min(F(i, N/i), min);
            }
        }
        return min;
    }

    private static int F(long a, long b) {
        return Math.max( String.valueOf(a).length(), String.valueOf(b).length() );
    }
}
