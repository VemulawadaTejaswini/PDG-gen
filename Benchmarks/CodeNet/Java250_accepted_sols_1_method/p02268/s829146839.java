import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n, q;
        n = input.nextInt();
        ArrayList<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            int x = input.nextInt();
            if (s.size() > 0 && x == s.get(s.size() - 1)) continue;
            s.add(x);
        }
        q = input.nextInt();
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int i = 0; i < q; ++i) {
            int x = input.nextInt();
            t.add(x);
        }
        s.retainAll(t);
        System.out.println(s.size());
    }                
}