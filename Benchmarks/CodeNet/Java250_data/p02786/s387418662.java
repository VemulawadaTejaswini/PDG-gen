import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

        System.out.println(f(h));
    }

    private static long f(long x) {
        if (x == 1) return 1;
        long a = f(x/2);
        return a*2+1;
    }
}
