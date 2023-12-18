import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            if (!freq.containsKey(score)){
                freq.put(score, 1);
            }
            else freq.put(score, 1 + freq.get(score));
        }

        int m = scanner.nextInt();
        boolean can = true;
        for (int i = 0; i < m; i++) {
            int s = scanner.nextInt();
            if (freq.containsKey(s) && freq.get(s) > 0){
                freq.put(s, freq.get(s) - 1);
            }
            else if (freq.containsKey(s) && freq.get(s) == 0){
                can = false;
            }
            else can = false;
        }

        System.out.println(can?"YES":"NO");
    }
}
