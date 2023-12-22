import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        String[] ss = new String[N];
        for (int i = 0; i < N; i++) {
            ss[i] = sc.next();
        }
        String ans = "Yes";
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (ss[i].equals(ss[j])) {
                    ans = "No";
                    break;
                }    
            }
        }
        for (int i = 0; i < N - 1; i++) {
            char last = ss[i].charAt(ss[i].length() - 1);
            char first = ss[i+1].charAt(0);
            if (last != first) {
                ans = "No";
                break;
            } 
        }
        
        out.println(ans);
        
        out.flush();
    }
}