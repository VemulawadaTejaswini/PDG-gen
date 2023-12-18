import java.util.Scanner;

/**
 * B - TAKOYAKI FESTIVAL 2019
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();   // たこ焼きの数
        int[] d = new int[n];   // 美味しさ


        for( int i = 0; i < n; i++ ) {
            d[i] = sc.nextInt();
        }

        int sum = 0;
        for( int j = 0; j < n; j++ ) {
            for( int k = j; k < ( n - 1 ); k++ ) {
                sum += d[j] * d[k + 1];
            }
        }

        System.out.println( sum );

        sc.close();
    }
}