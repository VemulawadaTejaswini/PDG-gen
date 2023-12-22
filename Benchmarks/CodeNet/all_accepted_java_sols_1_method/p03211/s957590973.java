import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        char[] ch = sc.next().toCharArray();
        final int N = ch.length;
        int min = 1000;
        
        for (int i = 0; i < N - 2; i++) {
            String s = "";
            s += ch[i];
            s += ch[i + 1];
            s += ch[i + 2];
            int x = Integer.parseInt(s);
            min = Math.min(Math.abs(753 - x), min);
        }
        
        out.println(min);
        
        out.flush();
    }
}