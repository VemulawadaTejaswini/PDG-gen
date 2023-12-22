import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // // スペース区切りの整数の入力
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // 文字列の入力
        // String s = sc.next();
        // 出力
        String ans = "hon";
        int dig = a % 10;
        if (dig == 3) {
            ans = "bon";
        } else if (dig == 0 || dig == 1 || dig == 6 || dig == 8) {
            ans = "pon";
        }
        System.out.println(ans);
    }
}
