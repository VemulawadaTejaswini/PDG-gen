import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int maxn;
    long[] frac,inv;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve() throws IOException {
        int n = sc.nextInt();
        return (n+1)/2;
    }
}

