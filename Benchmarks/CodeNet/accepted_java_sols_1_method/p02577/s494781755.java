import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final String varN = sc.next();
        sc.close();

        int resultNo = Stream.of(varN.split("")).mapToInt(Integer::parseInt).sum();
        String result;
        if (resultNo % 9 == 0) {
            result = "Yes";
        } else {
            result = "No";
        }
        System.out.println(result);
    }
}