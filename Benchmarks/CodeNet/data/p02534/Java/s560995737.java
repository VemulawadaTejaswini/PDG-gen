import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
public class Main {
    
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ARepeatACL solver = new ARepeatACL();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class ARepeatACL {
        
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int a = Integer.parseInt(in.next());
            String tmp = "";
            for (int i = 0; i < a; i++) {
                tmp += "ACL";
            }
            out.println(tmp);
        }
        
    }
}

