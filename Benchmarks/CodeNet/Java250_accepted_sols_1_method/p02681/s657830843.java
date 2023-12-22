import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t.substring(0, t.length() - 1))) {
            out.println("Yes");
        }
        else {
            out.println("No");
        }
        out.flush();
    }
}