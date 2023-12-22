import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        int maxStart = 0;
        int minEnd = 1000000;
        for (int i = 0; i < M; i++) {
            int start = Integer.parseInt(sc.next());
            int end = Integer.parseInt(sc.next());
            maxStart = Math.max(maxStart, start);
            minEnd = Math.min(minEnd, end);
        }
        
        out.println(minEnd >= maxStart ? minEnd - maxStart + 1 : "0");
        
        out.flush();
    }
}