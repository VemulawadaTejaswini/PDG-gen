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
            c += M / 4;
        } else {
            c = M / 2;
        }
        System.out.println(c);
    }
}
