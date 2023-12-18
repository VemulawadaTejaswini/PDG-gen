import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        int diff = 0;
        int ans;

        while (true) {

            int left = x - diff;
            if (!set.contains(left)) {
                ans = left;
                break;
            }

            int right = x + diff;
            if (!set.contains(right)) {
                ans = right;
                break;
            }

            diff++;
        }

        System.out.println(ans);
    }
}