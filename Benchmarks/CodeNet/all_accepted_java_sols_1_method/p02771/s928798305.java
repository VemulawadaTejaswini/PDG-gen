import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        boolean isPoor = false;
        if ((a == b && a != c)
                || (a == c && a != b)
                || (b == c && a != b)) {
            isPoor = true;
        }
        out.println(isPoor ? "Yes" : "No");
        out.flush();
    }
}