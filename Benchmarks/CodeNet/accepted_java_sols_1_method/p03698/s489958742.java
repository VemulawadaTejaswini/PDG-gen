import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        char[] ch = sc.next().toCharArray();
        final int N = ch.length;
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (ch[i] == ch[j]) ans = false;
            }
        }
        out.println(ans ? "yes" : "no");
        
        out.flush();
    }
}