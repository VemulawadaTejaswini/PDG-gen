import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        DecimalFormat df = new DecimalFormat("0.00000000");
        
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++)
            ans += "x";
        out.println(ans);
        
        out.flush();
    }
}