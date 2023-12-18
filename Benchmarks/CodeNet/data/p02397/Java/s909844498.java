import java.util.*;

class SwappingTwoNumbers {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        while(true) {
            final int a = sc.nextInt();
            final int b = sc.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.println(a < b ? a + " " + b : b + " " + a);
        }
    }
}
public class Main {
    public static void main(String... args) {
        SwappingTwoNumbers.main();
    }
}