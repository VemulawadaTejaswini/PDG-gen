import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        Integer result;
        Integer total = Integer.sum(a, b);

        if (total > 3) {
            result = Math.abs(a - b);
        } else {
           result = a + b;
        }

        System.out.println(result);
    }
}
