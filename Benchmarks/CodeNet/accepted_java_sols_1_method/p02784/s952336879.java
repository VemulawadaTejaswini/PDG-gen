import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        final long H = Long.parseLong(sc.next());
        final int N = Integer.parseInt(sc.next());
        long sum = 0;
        for (int i=0; i<N; i++)
            sum += Long.parseLong(sc.next());
        out.println(sum >= H ? "Yes" : "No");
        
        out.flush();
    }
}