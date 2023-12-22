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
        long temp;
        while (true) {
            n = Math.abs(ans - k);
            if (ans < n) {
                break;
            } else {
                temp = ans;     ans = n;    n = temp;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}