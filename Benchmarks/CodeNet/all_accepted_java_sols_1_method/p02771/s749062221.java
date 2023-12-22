import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer c = Integer.parseInt(scanner.next());

        if (a.equals(b) != a.equals(c) || b.equals(a) != b.equals(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}