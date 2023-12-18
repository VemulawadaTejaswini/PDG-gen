import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        String ans;
        while (true) {
            c -= b;
            if (c <= 0) {
                ans = "Yes";
                break;
            }
            a -= d;
            if (a <= 0) {
                ans = "No";
                break;
            }
        }


        
        out.println(ans);
        
        out.flush();
    }
}