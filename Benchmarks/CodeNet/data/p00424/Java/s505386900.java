import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            solve(n);
        }
    }
    
    private static void solve(int n) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0;i < n;i++) {
            String k = sc.next();
            String v = sc.next();
            map.put(k,v);
        }
        int m = sc.nextInt();
        for (int i = 0;i < m;i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                s = map.get(s);
            }
            System.out.print(s);
        }
        System.out.println("");
    }
}

