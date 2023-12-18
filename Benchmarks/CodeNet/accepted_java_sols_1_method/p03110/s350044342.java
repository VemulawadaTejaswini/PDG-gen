import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigDecimal d = new BigDecimal("0");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            BigDecimal x = new BigDecimal(sc.next());
            String u = sc.next();
            if(u.equals("JPY")) d = d.add(x);
            else d = d.add(x.multiply(new BigDecimal("380000")));
        }

        System.out.println(d.toPlainString());

    } 
}