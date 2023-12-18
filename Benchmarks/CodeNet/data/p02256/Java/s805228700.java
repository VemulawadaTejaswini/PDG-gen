import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        long arg1 = Integer.parseInt(in[0]);
        long arg2 = Integer.parseInt(in[1]);
        long n = gcd(arg1, arg2);
        System.out.println(n);
    }

    static long gcd(long arg1, long arg2) {
        if (arg1 < arg2) {
            long v = arg1;
            arg1 = arg2;
            arg2 = v;
        }
        while (arg2 > 0) {
            long v = arg1 % arg2;
            arg1 = arg2;
            arg2 = v;
        }
        return arg1;
    }
}

