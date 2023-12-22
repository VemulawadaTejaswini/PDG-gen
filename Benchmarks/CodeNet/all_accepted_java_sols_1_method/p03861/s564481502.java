import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();

        if(a % x != 0)
        	a = a + (x - a % x);

        if(b % x != 0)
        	b = b - (b % x);
        if(a > b)
        	System.out.println(0);
        else
        	System.out.println((b - a) / x + 1);
    }
}
