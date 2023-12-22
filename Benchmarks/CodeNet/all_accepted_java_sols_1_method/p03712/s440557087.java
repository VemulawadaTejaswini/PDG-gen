import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        
        for (int i = 0; i < W + 2; i++) {
            out.print("#");
        }
        out.println();
        
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            out.println("#" + s + "#");
        }
        
        for (int i = 0; i < W + 2; i++) {
            out.print("#");
        }
        out.println();
        
        out.flush();
    }
}