import java.util.*;
class Main {
    public static void main(String...args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int divisor = 0;

        while((divisor = x % y) != 0) {
                x = y;
                y = divisor;
        }
        System.out.println(y);
    }
}

