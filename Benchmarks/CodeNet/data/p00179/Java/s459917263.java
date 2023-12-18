import java.util.*;
public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("0")) break;
            System.out.println(dfs(convert(s)));
        }
    }
    
    String dfs(String str) {
        Set<String> visited = new HashSet<String>();
        visited.add(str);
        
        LinkedList<String> q = new LinkedList<String>();
        LinkedList<Integer> qi = new LinkedList<Integer>();
        q.add(str); qi.add(0);
        
        while (!q.isEmpty()) {
            String s = q.removeFirst();
            int c = qi.removeFirst();  
            if (ok(s)) return "" + c;
            for (int i = 0; i < s.length() - 1; i++) if (s.charAt(i) != s.charAt(i + 1)) {
                int n = s.charAt(i) - '0' + s.charAt(i + 1) - '0';
                n = (3 - n % 3) % 3;
                String next = s.substring(0, i) + n + n + s.substring(i + 2, s.length());
                if (!visited.contains(next)) {
                    q.addLast(next);
                    qi.addLast(c+1);
                    visited.add(next);
                }
            }
        }
        return "NA";
    }
    
    String convert(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
            case 'r': ret += "" + 0; break;
            case 'g': ret += "" + 1; break;
            case 'b': ret += "" + 2; break;
            }
        }
        return ret;
    }
    
    boolean ok(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
}