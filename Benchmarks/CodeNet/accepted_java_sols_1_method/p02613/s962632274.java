import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> cnt = new HashMap<>();
        cnt.put("AC", 0);
        cnt.put("WA", 0);
        cnt.put("TLE", 0);
        cnt.put("RE", 0);
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            cnt.put(s, cnt.get(s) + 1);
        }
        System.out.println("AC x "+cnt.get("AC"));
        System.out.println("WA x "+cnt.get("WA"));
        System.out.println("TLE x "+cnt.get("TLE"));
        System.out.println("RE x "+cnt.get("RE"));
    }
}