import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 変数
        int val = 0; // 入力値
        int a = 0; // 底
        int com = 0; // 比較用
        int count = 1; // 結果

        // 入力値
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        a = sc.nextInt();

        com = a;

        while (val >= com){
            com *= a;
            count += 1;
        }

        // 出力
        System.out.println(count);
    }
}
