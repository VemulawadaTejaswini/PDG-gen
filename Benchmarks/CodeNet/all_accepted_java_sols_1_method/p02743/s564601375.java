import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        String ans = "";
        long d = c - a - b;
        if (4 * a * b < d * d && d > 0)
            ans = "Yes";
        else {
            ans = "No";
        }
        System.out.println(ans);
    }
}
