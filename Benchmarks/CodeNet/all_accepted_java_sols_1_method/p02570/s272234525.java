import java.util.Scanner;

/**
 * A - Don't be late
 * 高橋君は青木君と待ち合わせをしています。
 * 待ち合わせ場所は高橋君の家から D メートル離れた地点であり、待ち合わせの時刻は T 分後です。
 * 高橋君は今から家を出発し、分速 S メートルで待ち合わせ場所までまっすぐ移動します。
 * 待ち合わせに間に合うでしょうか？
 */
public class Main {

    public static void main( String[] args ) {

        // 入力値
        Scanner sc = new Scanner( System.in );
        int d = sc.nextInt();   // 高橋くんの家から待ち合わせまでの距離（m）
        int t = sc.nextInt();   // 今から待ち合わせまでの時間（分）
        int s = sc.nextInt();   // 高橋くんが待ち合わせに向かう速度

        System.out.println( t >= ( double ) d / s ? "Yes" : "No" );

        sc.close();
    }
}
