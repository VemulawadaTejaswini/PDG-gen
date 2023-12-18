import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        double b = scanner.nextDouble();
        b *= 100;
        long c = (long) b;
        long res = a * c;
        System.out.println(res / 100);
    }
}
