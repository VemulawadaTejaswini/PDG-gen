import java.util.Scanner;

/**
 * A - Registration
 * 高橋君はとあるWebサービスに会員登録しようとしています。
 * まずIDを S として登録しようとしました。しかし、このIDは既に他のユーザーによって使用されていました。
 * そこで、高橋君は S の末尾に 1 文字追加した文字列をIDとして登録することを考えました。
 * 高橋君は新しくIDを T として登録しようとしています。これが前述の条件を満たすか判定してください。
 * 羊が狼に襲われるなら unsafe、襲われないなら safe を出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        // 登録しようとしたID
        String s = sc.next();
        // 次に登録しようとしたID
        String t = sc.next();

        System.out.println( s.equals( t.substring( 0, s.length() ) ) ? "Yes" : "No" );

        sc.close();
    }
}
