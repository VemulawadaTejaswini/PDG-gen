import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < k; i++) {
                int d = s.nextInt();
                for (int j = 0; j < d; j++) {
                    set.add(s.next());
                }
            }
            System.out.println(n - set.size());
        }
    }
}