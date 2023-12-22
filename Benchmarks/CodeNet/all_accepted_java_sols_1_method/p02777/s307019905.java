
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        String u = scanner.next();

        if (s.equals(u)) {
            a--;
        } else {
            b--;
        }

        System.out.println(a + " " + b +" ");
    }
}