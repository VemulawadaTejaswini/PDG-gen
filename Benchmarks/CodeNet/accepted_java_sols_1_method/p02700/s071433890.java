import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),
            b = sc.nextInt(),
            c = sc.nextInt(),
            d = sc.nextInt();

        int s = 0;
        while (a > 0 && c > 0) {
            if (s == 0) {
                c -= b;
                s = 1;
            }
            else {
                a -= d;
                s = 0;
            }
        }

        System.out.println(a > 0 ? "Yes" : "No");
    }
}