import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long a = Long.parseLong(sc.next());
        final long b = Long.parseLong(sc.next());
        final long c = Long.parseLong(sc.next());
        sc.close();

        if (c - a - b > 0 && (c - a - b) * (c - a - b) > 4 * a * b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}