import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        StringBuilder sb = new StringBuilder(sc.next());
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            String order = sc.next();
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (order.equals("replace")) {
                String str = sc.next();
                sb.replace(a, b + 1, str);
            } else if (order.equals("reverse")) {
                StringBuilder sb2 = new StringBuilder(sb.substring(a, b + 1));
                sb.replace(a, b + 1, sb2.reverse().toString());
            } else {
                out.println(sb.substring(a, b + 1));
            }
        }

        out.flush();
    }
}
