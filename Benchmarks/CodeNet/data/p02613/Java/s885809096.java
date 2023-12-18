import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        Map<String, Integer> ansMap = new HashMap<>();
        int index = 0;

        while (index < numOfCases) {
            String str = sc.next();
            if (ansMap.containsKey(str)) {
                ansMap.put(str, ansMap.get(str) + 1);
            } else {
                ansMap.put(str, 1);
            }
            index++;
        }

        if (!ansMap.containsKey("AC")) {
            ansMap.put("AC", 0);
        }
        if (!ansMap.containsKey("WA")) {
            ansMap.put("WA", 0);
        }
        if (!ansMap.containsKey("TLE")) {
            ansMap.put("TLE", 0);
        }
        if (!ansMap.containsKey("RE")) {
            ansMap.put("RE", 0);
        }

        for (Map.Entry entry: ansMap.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }

    }
}