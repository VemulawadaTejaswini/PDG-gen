import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a + b;
        int minus = a - b;
        int mult = a * b;

        if (plus > minus) {
            if (plus > mult) {
                System.out.println(plus);
            } else {
                System.out.println(mult);
            }
        } else if (minus > plus) {
            if (minus > mult) {
                System.out.println(minus);
            } else {
                System.out.println(mult);
            }
        } else {
            System.out.println(plus);
        }
    }
}