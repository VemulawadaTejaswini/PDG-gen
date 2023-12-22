import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        int ans = 0;
        
        for (int i = A; i <= B; i++) {
            if ((i / 10000 == i % 10) && (i / 1000 % 10 == i % 100 / 10)) {
                ans++;
            }
        }
        
        out.println(ans);
        
        out.flush();
    }
}