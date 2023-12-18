import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        ArrayDeque<Integer> list = new ArrayDeque<Integer>(2000000);
        
        try {
        int n = input.nextInt();
        while (n-- > 0) {
            String s = input.next();
            if ("insert".equals(s)) {
                int x = input.nextInt();
                list.addFirst(x);
            } else if ("delete".equals(s)) {
                int x = input.nextInt();
                list.remove(x);
            } else if ("deleteFirst".equals(s)) {
                list.pollFirst();
            } else if ("deleteLast".equals(s)) {
                list.pollLast();
            }
        }
        } catch (IOException e) {}
        print(list.toArray());
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() throws IOException {
            st.nextToken();
            return st.sval;
        }
        
        public Integer nextInt() throws IOException {
            st.nextToken();
            return (int)st.nval;
        }
    }
}