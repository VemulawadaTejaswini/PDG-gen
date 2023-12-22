import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final long N = Long.parseLong(sc.next());
        long blue = Long.parseLong(sc.next());
        long red = Long.parseLong(sc.next());
        
        out.println(N / (blue + red) * blue + Math.min(blue, N % (blue + red)));
        
        out.flush();
    }
}