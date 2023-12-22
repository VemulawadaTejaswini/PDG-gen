import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long d = Long.parseLong(sc.next());

        long max = (a * c);
        max = Math.max(max, (b * c));
        max = Math.max(max, (a * d));
        max = Math.max(max, (b * d));
        System.out.println(max);
    }
}