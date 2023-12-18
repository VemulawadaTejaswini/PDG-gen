import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        String[] ss = new String[H];
        for (int i = 0; i < H; i++) {
            ss[i] = sc.next();
        }
        
        for (int i = 0; i < H; i++) {
                out.println(ss[i]);
                out.println(ss[i]);
        }
        
        out.flush();
    }
}