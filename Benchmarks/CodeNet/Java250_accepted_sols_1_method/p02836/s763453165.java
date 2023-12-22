import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            int number = 0;
            // 回文の判定
            for (int i = 0, length = s.length(); i < length / 2; ++i) {
                if (s.substring(i, i + 1).equals(s.substring(length - i - 1, length - i))) {
                    continue;
                } else {
                    number++;
                }
            }
            System.out.println(number);
        }
    }

}
