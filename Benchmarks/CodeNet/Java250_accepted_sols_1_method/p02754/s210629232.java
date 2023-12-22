import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        // 変数宣言
        long total = 0;
        long blue = 0;
        long result = 0;
        long n;
        long a;
        long b;

        // 入力
        Scanner sc = new Scanner(System.in);
        
        n = Long.parseLong(sc.next());
        a = Long.parseLong(sc.next());
        b = Long.parseLong(sc.next());

        sc.close();

        // 演算処理
        long i = n / ( a + b );
        long j = n % ( a + b ); 
        result = a*i;

        if( j < a ){
            result = result + j;
        }else{
            result = result + a;
        }

        // resultを出力
        System.out.println( result );

    }
}