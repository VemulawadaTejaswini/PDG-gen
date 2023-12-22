import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        String c = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        map.put(a, x);
        map.put(b, y);
        map.put(c, map.get(c) - 1);
        
        System.out.println(map.get(a) + " " + map.get(b));
    }
}
