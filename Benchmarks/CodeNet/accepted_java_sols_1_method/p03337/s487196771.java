import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a + b;
        int minus = a - b;
        int mul = a * b;
        int max = Math.max(plus, Math.max(minus, mul));

        System.out.println(max);
    }
}
