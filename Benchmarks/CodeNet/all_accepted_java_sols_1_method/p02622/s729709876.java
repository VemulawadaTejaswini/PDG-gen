import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        PrintWriter out = new PrintWriter(System.out);
        
        Integer ll = a.length();
        Integer ans = 0;
        
        for (int i=0;i<ll;i++) {
            if (!a.substring(i,i+1).equals(b.substring(i,i+1))) {
                ans++;
            }
        }
        
        out.println(ans);
        out.close();
    }
}
