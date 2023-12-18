import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> res = new LinkedList<Integer>();
        for (int i = 0; i < n; ++i) {
            String op = input.next();
            if (op.equals("insert")) {
                int x = input.nextInt();
                res.add(0, x);
            } else if (op.equals("delete")) {
                int x = input.nextInt();
                res.remove(res.indexOf(x));
            } else if (op.equals("deleteFirst")) {
                res.remove(0);
            } else if (op.equals("deleteLast")) {
                res.remove(res.size() - 1);
            }
        }
        if (res.size() > 0) {
            System.out.print(res.get(0));
            for (int i = 1; i < res.size(); ++i) System.out.print(" " + res.get(i));
            System.out.println("");
        }        
    }                
}