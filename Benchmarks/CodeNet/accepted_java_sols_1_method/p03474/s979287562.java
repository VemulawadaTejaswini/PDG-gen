import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        String[] ss = sc.next().split("-");
        
        if (ss.length == 2
                && ss[0].length() == A
                && ss[0].matches("[0-9]+")
                && ss[1].length() == B
                && ss[1].matches("[0-9]+")) {
            out.println("Yes");
        } else {
            out.println("No");
        }
        
        out.flush();
    }
}