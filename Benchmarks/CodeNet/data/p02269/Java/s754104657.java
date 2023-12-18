import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        Tree t = new Tree();
        int n = input.nextInt();
        while (n-- > 0) {
            String op = input.next();
            String str = input.next();
            if ("insert".equals(op)) {
                t.add(str);
            } else if ("find".equals(op)) {
                if (t.contains(str)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Tree {
        String value;
        Tree left;
        Tree right;
        
        public void add(String s) {
            if (value == null) {
                value = s;
                return;
            }
            if (value.compareTo(s) <= 0) {
                if (left == null) left = new Tree();
                left.add(s);
            } else {
                if (right == null) right = new Tree();
                right.add(s);
            }
        }
        public boolean contains(String s) {
            if (s == null || value == null) return false;
            if (value.equals(s)) return true;
            if (value.compareTo(s) <= 0) return left == null ? false : left.contains(s);
            else return right == null ? false : right.contains(s);
        }
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}