
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Map<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < 4; ++i) {
            int current = str.charAt(i) - 'A';
            int count = num.getOrDefault(current, 0);
            num.put(current, count + 1);
        }
        if (num.size() == 2) {
            for (int value : num.values()) {
                if (value != 2) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
