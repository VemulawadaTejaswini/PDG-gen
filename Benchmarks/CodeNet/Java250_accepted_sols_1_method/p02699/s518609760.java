import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int S = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        




        
        out.println(S <= W ? "unsafe" : "safe");
        
        out.flush();
    }
}