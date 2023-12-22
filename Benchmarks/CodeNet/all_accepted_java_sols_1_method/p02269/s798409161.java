import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Long> set = new HashSet<Long>();
        for (int i = 0; i < n; ++i) {
            String op = input.next();
            String st = input.next();
            long enc = 0;
            for (int k = 0; k < st.length(); ++k) {
                switch (st.charAt(k)) {
                    case 'A': enc = enc * 10 + 1;
                        break;
                    case 'C': enc = enc * 10 + 2;
                        break;
                    case 'G': enc = enc * 10 + 3;
                        break;
                    case 'T': enc = enc * 10 + 4;
                        break;
                }
            }
            if (op.equals("insert")) set.add(enc);
            else if (op.equals("find")) {
                if (set.contains(enc)) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }                
}