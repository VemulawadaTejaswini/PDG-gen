import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        BigInteger n = new BigInteger(sc.next());
        double m = sc.nextDouble();
        var x = n.doubleValue() * m;
        
        String out = String.format("%.0f", (x - (x % 1)));
        System.out.println(out);
    }
}
