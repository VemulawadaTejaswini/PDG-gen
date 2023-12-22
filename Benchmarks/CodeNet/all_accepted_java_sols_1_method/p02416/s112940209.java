import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 標準入力からデータを読み込む準備
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                String s = sc.next();
                if (s.equals("0"))
                    break;
                int answer = 0;
                for (int i = 0; i < s.length(); i++) {
                    answer += Character.digit(s.charAt(i), 10); // answer += s.charAt(i) - '0'; も可能
                }
                System.out.println(answer);
            }
        }
    }
}
