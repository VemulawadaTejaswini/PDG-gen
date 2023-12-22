import java.util.Scanner;

/**
 * B - FizzBuzz Sum
 * FizzBuzz列 a1,a2,... を次のように定めます。
 * i が 3 でも 5 でも割り切れるなら、ai=FizzBuzz
 * そうではなく i が 3 で割り切れるなら、ai=Fizz
 * そうではなく i が 5 で割り切れるなら、ai=Buzz
 * そうではないなら、ai=i
 * FizzBuzz列の N 項目までに含まれる数の和を求めてください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された整数
        long n = sc.nextLong();

        // 入力値までの整数で3でも5でも割り切れない数の総和を求める
        long sum = 0;
        for( int i = 1; i <= n; i++ ) {
            if( i % 3 != 0 && i % 5 != 0 ) {
                sum += i;
            }
        }

        System.out.println( sum );

        sc.close();
    }
}
