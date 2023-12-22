import java.util.*;
import java.lang.*;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();

        long i = n / (a + b) * a;
        long j = Math.min(n % (a + b), a);
        System.out.println(i + j);
    }
}