import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String x = scanner.next();

            if (x.equals("0")) break;

            int ret = 0;
            for (int i = 0; i < x.length(); ++i) {
                ret += x.charAt(i) - '0';
            }

            System.out.println(ret);
        }
    }
}
