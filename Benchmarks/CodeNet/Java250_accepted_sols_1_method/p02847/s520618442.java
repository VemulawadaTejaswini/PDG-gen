
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> next = new HashMap<>();
        next.put("SUN", 7);
        next.put("MON", 6);
        next.put("TUE", 5);
        next.put("WED", 4);
        next.put("THU", 3);
        next.put("FRI", 2);
        next.put("SAT", 1);
        
        String current = scanner.next();
        System.out.println(next.get(current));
    }
}
