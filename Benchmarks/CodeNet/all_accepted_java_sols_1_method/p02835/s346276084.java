import java.util.*;

public class Main {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        long a1 = scanner.nextLong();
        long a2 = scanner.nextLong();
        long a3 = scanner.nextLong();

        if (a1+a2+a3 >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }

    }
}