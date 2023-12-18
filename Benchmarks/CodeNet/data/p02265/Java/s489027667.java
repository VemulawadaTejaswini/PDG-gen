import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Deque<Integer> res = new ArrayDeque<Integer>();       
        for (int i = 0; i < n; ++i) {
            String op = input.next();
            if (op.equals("insert")) {
                int x = input.nextInt();
                res.addFirst(x);
            } else if (op.equals("delete")) {
                int x = input.nextInt();
                if (res.contains(x)) res.remove(x);
            } else if (op.equals("deleteFirst")) {
                if (res.size() > 0) res.pollFirst();                
            } else if (op.equals("deleteLast")) {
                if (res.size() > 0) res.pollLast();
            }
        }
        if (res.size() > 0) {
            System.out.print(res.poll());
            for (int x : res) System.out.print(" " + x);
        }        
        System.out.println("");
    }                
}