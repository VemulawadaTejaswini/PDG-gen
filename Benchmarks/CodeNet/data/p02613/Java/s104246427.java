import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        while (n-- > 0) {
            String tmp = sc.next();
            int val = map.getOrDefault(tmp, 0);
            map.put(tmp, ++val);
        }
        
        System.out.println("AC x " + map.getOrDefault("AC", 0));
        System.out.println("WA x " + map.getOrDefault("WA", 0));
        System.out.println("TLE x " + map.getOrDefault("TLE", 0));
        System.out.println("RE x " + map.getOrDefault("RE", 0));
    }
}
