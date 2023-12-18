import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String op = sc.next();
        int b = Integer.parseInt(sc.next());
        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else {
            result = a - b;
        }
        System.out.println(result);
    }
}