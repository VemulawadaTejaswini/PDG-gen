import java.io.PrintWriter;
import java.util.*;

public class Main {


    static Scanner sc;
    static PrintWriter out;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new Main().solve();
        out.flush();
    }

    public void solve() {
        int k  = sc.nextInt();
        for(int i=0; i<k; i++) {
            out.print("ACL");
        }
        out.println();

    }

}
