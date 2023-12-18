import java.util.Scanner;

/**
 * A - αlphabet
 * 英大文字か英小文字のいずれか 1 文字 α が入力されます。
 * α が英大文字なら A、英小文字なら a と出力してください。
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );
        String a = sc.next();

        System.out.println( Character.isUpperCase( a.charAt( 0 ) ) ? "A" : "a" );

        sc.close();
    }
}