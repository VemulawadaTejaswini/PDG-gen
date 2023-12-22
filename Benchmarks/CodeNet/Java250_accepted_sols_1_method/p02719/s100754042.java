import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        long ans = n % k;
        n = Math.abs(ans - k);
        pw.println(Math.min(ans, n));
        
        pw.flush();
    }
}