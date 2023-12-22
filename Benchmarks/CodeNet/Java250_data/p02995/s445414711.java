import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long numC = b / c - (a - 1) / c;
        long numD = b / d - (a - 1) / d;

        long l = lcm(c, d);
        long numL = b / l - (a - 1) / l;

        System.out.print(b - a - (numC + numD - numL) + 1);
    }


    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return c/b;
    }
}