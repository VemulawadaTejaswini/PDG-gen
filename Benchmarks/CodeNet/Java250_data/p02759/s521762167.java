import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        int n = Integer.parseInt(sc.next());
        pw.println(n%2 == 0 ? n/2 : (n+1)/2);
        
        pw.flush();
    }
}