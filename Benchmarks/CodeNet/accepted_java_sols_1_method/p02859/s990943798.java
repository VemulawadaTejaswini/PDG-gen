import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");

        final int R = Integer.parseInt(sc.next());
        out.println(R*R);
        
        out.flush();
    }
}