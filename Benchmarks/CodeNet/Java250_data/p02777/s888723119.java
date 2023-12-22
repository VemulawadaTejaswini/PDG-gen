import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        String s = sc.next();
        String t = sc.next();
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String u = sc.next();
        if (u.equals(s))
            a--;
        else
            b--;
        out.println(a + " " + b);
        
        out.flush();
    }
}
