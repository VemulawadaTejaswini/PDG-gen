import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> score = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String word = sc.next();
            score.put(word, score.getOrDefault(word, 0) + 1);
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String word = sc.next();
            score.put(word, score.getOrDefault(word, 0) - 1);
        }
        int max = 0;
        for(int s : score.values())
            max = Math.max(max, s);
        System.out.println(max);
    }
}
