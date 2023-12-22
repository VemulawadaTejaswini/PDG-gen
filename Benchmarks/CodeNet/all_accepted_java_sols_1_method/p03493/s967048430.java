import java.util.Scanner;

public class Main {
// Mainに書き換え！

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // 出力
        System.out.println(s.replaceAll("0", "").length());
    }
}
