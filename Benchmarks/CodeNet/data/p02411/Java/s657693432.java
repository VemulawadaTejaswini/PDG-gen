import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while (true) {
            int m = Integer.parseInt(sc.next())
               ,f = Integer.parseInt(sc.next())
               ,r = Integer.parseInt(sc.next());
            if (m == -1 && f == -1 && r == -1)
                break;    
            else if (m == -1 || f == -1 || m + f < 30)
                pw.println("F");
            else if (m + f >= 80)
                pw.println("A");
            else if (m + f >= 65)
                pw.println("B");
            else if (m + f >= 50 || r >= 50)
                pw.println("C");
            else
                pw.println("D");
        }
        pw.flush();
    }
}
