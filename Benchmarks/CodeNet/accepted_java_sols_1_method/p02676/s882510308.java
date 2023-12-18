import java.util.Scanner;

/**
 * B - ... (Triple Dots)
 * 英小文字からなる文字列 S があります。
 * S の長さが K 以下であれば、S をそのまま出力してください。
 * S の長さが K を上回っているならば、先頭 K 文字だけを切り出し、末尾に ... を付加して出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // Sを取得する長さ K
        int k = sc.nextInt();
        // 英小文字からなる文字列 S
        String s = sc.next();

        System.out.println( s.length() <= k ? s : s.substring( 0, k) + "..." );

        sc.close();
    }
}