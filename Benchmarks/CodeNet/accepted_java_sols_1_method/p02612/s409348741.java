import java.util.*;
import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        while (n >= 1000) {
            n = n - 1000;
        }
        if (n != 0 && 1000 >= n) {
            n = 1000 - n;
        }

        out.println(n);
    }
}