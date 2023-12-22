import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int k;
    long[] d;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException{
        String s1 = "AAA", s2 = "BBB";
        String s = sc.next();
        String ans = "Yes";
        if(s.equals(s1)||s.equals(s2)) ans= "No";
        System.out.println(ans);
    }
}

