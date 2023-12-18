import java.util.*;

public class Main {
    public static void main(String[] args){
        // Scannerクラスのインスタンスを作成
        // 引数で標準入力System.inを指定する
        Scanner scanner = new Scanner(System.in);

        //入力内容をインスタンスから取得。a,bに代入する。
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*b + " " + (a*2+b*2));

        scanner.close();
    }
}
