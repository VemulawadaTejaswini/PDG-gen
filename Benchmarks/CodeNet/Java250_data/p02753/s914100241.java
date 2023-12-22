import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字の入力
        String s = sc.next();
        // 出力用
        String answer = "No";
        if (s.contains("A")) {
            if (s.contains("B")) {
                answer = "Yes";
            }
        }
        // 出力
        System.out.println(answer);
    }
}