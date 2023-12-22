import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int n = Integer.parseInt(sc.next());
        int a;
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(sc.next());
            if (a % 2 == 0 && a % 3 != 0 && a % 5 != 0) ans = false;
        }
        out.println(ans ? "APPROVED" : "DENIED");
        out.flush();
    }
}