import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a > b) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(a == b ? 1 : 0);
        } else {
            System.out.println((n-2) * (b-a) + 1);
        }
    }
}
