import java.util.*;

public class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();
        Map<String, Integer> judgeCount = new HashMap<>();

        for (int i = 0; i < N; i++){
            String key = sc.next();
            if (judgeCount.containsKey(key)) {
                judgeCount.replace(key, judgeCount.get(key)+1);
            } else {
                judgeCount.put(key, 1);
            }
        }

        System.out.println("AC x " + judgeCount.getOrDefault("AC", 0));
        System.out.println("WA x " + judgeCount.getOrDefault("WA", 0));
        System.out.println("TLE x " + judgeCount.getOrDefault("TLE", 0));
        System.out.println("RE x " + judgeCount.getOrDefault("RE", 0));
    }
}