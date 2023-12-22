import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp = b;
        b = a;
        a = tmp;
        tmp = c;
        c = a;
        a = tmp;
        out.println(a + " " + b +" " + c);
    }
}