import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result1 = 0;
        int result2 = 0;

        char temp = '0';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == temp) {
                result1++;
            } else {
                result2++;
            }

            if (temp == '0') {
                temp = '1';
            } else {
                temp = '0';
            }
        }

        System.out.println(result1 < result2 ? result1 : result2);
    }
}
