import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Zero");
            return;
        }

        if (a > 0) {
            System.out.println(b > 0 ? "Positive" : "Zero");
        } else {
            if (b > 0) {
                System.out.println( "Zero");
            } else {
                System.out.println(Math.abs(a - b) % 2 == 1 ? "Positive" : "Negative");
            }
        }
    }
}