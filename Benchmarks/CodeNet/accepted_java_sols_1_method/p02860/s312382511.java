import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int N = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = s.substring(0,N/2);
        t += t;
        out.println(s.equals(t) ? "Yes" : "No");
        
        out.flush();
    }
}