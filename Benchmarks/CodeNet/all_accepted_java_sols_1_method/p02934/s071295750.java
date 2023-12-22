import java.util.Scanner;

/**
 * B - Resistors in Parallel
 * N 個の整数の列A1,…,AN が与えられます。
 * これらの逆数の総和の逆数を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 整数の数
        int n = sc.nextInt();
//        System.out.println("整数：" +n);
        double result = 0;
        // 整数の列
        double[] a = new double[n];
        for( int i = 0; i < n; i++ ) {
            a[i] = sc.nextDouble();
            result += 1 / a[i];
        }
        System.out.println( 1 / result );
    }
}