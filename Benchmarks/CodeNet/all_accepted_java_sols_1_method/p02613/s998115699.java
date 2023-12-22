import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        while (s > 0) {
            String a = sc.next();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
            s--;
        }
        System.out.println("AC x " + map.getOrDefault("AC", 0));
        System.out.println("WA x " + map.getOrDefault("WA", 0));
        System.out.println("TLE x " + map.getOrDefault("TLE", 0));
        System.out.println("RE x " + map.getOrDefault("RE", 0));
    }
}