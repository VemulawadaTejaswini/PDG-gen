import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long val1 = sc.nextLong();

        long count = ("" + val1).length();
        for (long i = 1; (i * i) <= val1; i++) {
            if ((val1 % i) != 0) {
                continue;
            }
            long n = val1 / i;
            String a = "" + i;
            String b = "" + n;
            long val = Math.max(a.length(), b.length());
            if (count > val) {
                count = val;
            }
        }
        System.out.println(count);
    }
}