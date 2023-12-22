import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final long H = Long.parseLong(sc.next());
        out.println(ans(H));
        
        out.flush();
    }
    
    static long ans(long x) {
        if (x == 1) return 1;
        return 2 * ans(x / 2) + 1;
    }
}