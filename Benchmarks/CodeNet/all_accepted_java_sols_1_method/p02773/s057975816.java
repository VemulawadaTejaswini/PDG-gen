import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<String, Integer> wordmap = new TreeMap<>();
        int max = 0;
        for (int i=0;i<N;i++) {
            String S_n = sc.next();
            if (wordmap.containsKey(S_n)) {
                int count = wordmap.get(S_n);
                wordmap.put(S_n, count + 1);
                if (max <= count) max = count + 1;
            } else {
                wordmap.put(S_n, 1);
                if (max == 0) max = 1;
            }
        }

        for (String key : wordmap.keySet()) {
            if (wordmap.get(key) == max) System.out.println(key);
        }

    }
}