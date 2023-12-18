import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main{

    static double PI = Math.acos(-1);

    static void print(Object a){System.out.print(a);}
    static void println(Object a){System.out.println(a);}

    static int gcd(int a,int b) {
        if (a % b == 0) return b;
        return gcd(b,a % b);
    }

    static int lcm(int a,int b)
    {
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal(),b = scanner.nextBigDecimal();
        BigDecimal c = a.multiply(b);
        println(c.toBigInteger());

    }
}