import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        // int a = sc.nextInt();
        // // スペース区切りの整数の入力
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // 文字列の入力
        int k = sc.nextInt();
        String s = sc.next();
        String ans = s;
        if(s.length() > k) {
            ans = s.substring(0, k) + "...";
        }
        // 出力
        System.out.println(ans);
    }
}
