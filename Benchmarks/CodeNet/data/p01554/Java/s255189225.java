import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0;i < n;i++) {
            map.put(sc.next(),true);
        }
        int m = sc.nextInt();
        
        boolean b = true;
        for (int i = 0;i < m;i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                if (b) {
                    System.out.println("Opened by " + s);
                } else {
                    System.out.println("Closed by " + s);
                }
                b = !b;
            } else {
                System.out.println("Unknown " + s);
            }
        }
    }
}