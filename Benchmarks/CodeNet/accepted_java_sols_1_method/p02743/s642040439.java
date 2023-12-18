import java.util.*;

public class Main {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long v = c - a - b;
        System.out.println(v > 0 && v * v > 4 * a * b ? "Yes" : "No");
    }
}