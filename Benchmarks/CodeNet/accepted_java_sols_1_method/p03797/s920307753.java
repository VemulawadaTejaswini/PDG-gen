import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long c = 0;

        if (M >= 2 * N) {
            c = N;
            M -= 2 * N;
            N = 0;
        } else {
            c = M / 2;
            M = M % 2;
        }
        c += M / 4;

        System.out.println(c);
    }
}
