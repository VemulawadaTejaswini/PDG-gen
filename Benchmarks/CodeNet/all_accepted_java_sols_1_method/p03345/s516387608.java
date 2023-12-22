import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long a = cin.nextLong();
        long b = cin.nextLong();
        long c = cin.nextLong();
        long k = cin.nextLong();
        long r = a - b;
        if (Math.abs(r) > 1_000_000_000_000_000_000L)
            System.out.println("Unfair");
        else if (k % 2 == 0)
            System.out.println(r);
        else
            System.out.println(-r);
    }
}
