import java.util.Scanner;

/**
 * A - Air Conditioner
 * あなたは、室温が 30 度以上のとき、またそのときに限り、冷房の電源を入れます。
 * 今の室温は X 度です。冷房の電源を入れますか？
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int x = sc.nextInt();   // 今の室温

        System.out.println( x >= 30 ? "Yes" : "No" );

        sc.close();
    }
}