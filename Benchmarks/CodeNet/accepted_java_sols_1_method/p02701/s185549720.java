import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int duplicate = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (map.containsKey(s)) {
                duplicate++;
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(n-duplicate);
    }
}
