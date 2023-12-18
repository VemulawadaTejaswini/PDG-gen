import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = a+b;
        long mod = n%c;
        long div = Math.floorDiv(n, c);
        long ans = div*a + Math.min(a, mod);
        System.out.println(ans);
    }
}
