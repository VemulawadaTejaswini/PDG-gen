import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        long sum = 0;
        for (int i = 0; i < (1 << s.length); i++) {
            StringJoiner sj = new StringJoiner("");
            for (int j = 0; j < s.length; j++) {
                if ((1 & i >> j) == 1) {
                    if (j == 0) {
                        break;
                    }
                    sj.add("+");
                }
                sj.add(String.valueOf(s[j]));
            }
            if ("".equals(sj.toString())) {
                continue;
            }

            String[] expression = sj.toString().split("\\+");
            for (int j = 0; j < expression.length; j++) {
                sum += Long.parseLong(expression[j]);
            }
        }
        System.out.println(sum);
    }

}
