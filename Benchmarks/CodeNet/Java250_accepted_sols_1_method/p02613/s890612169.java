
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Map<String, Integer> answer = new HashMap<>();
        answer.put("AC", 0);
        answer.put("WA", 0);
        answer.put("TLE", 0);
        answer.put("RE", 0);

        for (int i = 0 ; i < N ; i++) {
            String result = scanner.next();
            answer.put(result, answer.getOrDefault(result, 0) + 1);
        }

        System.out.println("AC x " + answer.get("AC"));
        System.out.println("WA x " + answer.get("WA"));
        System.out.println("TLE x " + answer.get("TLE"));
        System.out.println("RE x " + answer.get("RE"));
    }
}
