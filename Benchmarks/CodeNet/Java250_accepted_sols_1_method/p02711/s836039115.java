import java.util.Scanner;

/**
 * A - Lucky 7
 * 3  桁の整数 N が与えられます。
 * N のいずれかの桁に数字の 7 は含まれますか？
 * 含まれるなら Yes を、含まれないなら No を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力された整数
        int n = sc.nextInt();

        System.out.println( String.valueOf( n ).contains( "7" ) ? "Yes" : "No" );

        sc.close();
    }
}