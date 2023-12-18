import java.util.Scanner;

/**
 * B - Crane and Turtle
 * 庭に何匹かの動物がいます。
 * これらはそれぞれ、2 本の足を持つ鶴か 4 本の足を持つ亀のいずれかです。
 * 高橋くんは、「庭の動物の総数は X 匹で、それらの足の総数は Y 本である」と発言しています。
 * この発言が正しいような鶴と亀の数の組合せが存在するか判定してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 入力値
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = ( x * 4 - y ) % ( 4 - 2 );
        System.out.println( result == 0 && result > 0 ? "Yes" : "No" );

        sc.close();
    }
}
