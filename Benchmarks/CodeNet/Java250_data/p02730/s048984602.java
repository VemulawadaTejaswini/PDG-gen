import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        sc.useDelimiter("\n");

        String s = sc.next();
        int n = s.length();
        String s2 = s.substring(0, (n-1)/2);
        String s3 = s.substring((n+3)/2-1);
        pw.println(kaibun(s) && kaibun(s2) && kaibun(s3) ? "Yes" : "No");
        
        pw.flush();
    }

    public static boolean kaibun (String str) {
        int n = str.length();
        for (int i = 0; i < n; i++)
            if (str.charAt(i) != str.charAt(n-1-i)) return false;
        return true;
    }
}