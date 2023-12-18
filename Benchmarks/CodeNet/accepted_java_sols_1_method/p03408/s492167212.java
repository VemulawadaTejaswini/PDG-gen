import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Map<String, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int c = m.getOrDefault(s, 0);
            m.put(s, c+1);
        }

        int M = sc.nextInt();
        int max = 0;
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            int c = m.getOrDefault(s, 0);
            m.put(s, c-1);
        }

        for (int i : m.values()) {
            if (i > max) max = i;
        }
        System.out.println(max);
    }
}