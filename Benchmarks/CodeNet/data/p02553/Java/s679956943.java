import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());

        if (0 < b && 0 < d) {
            System.out.println(b * d);
        } else if (0 > b && 0 > d) {
            System.out.println(a * c);
        } else {
            System.out.println(Math.max(a, c) * Math.min(a, d));
        }
    }
}