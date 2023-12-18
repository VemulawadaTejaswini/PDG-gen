import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> box = new HashSet<>();

        for (int i = 0; i < n; i++) {
            box.add(sc.nextInt());
        }

        int diff = 0;
        int ans = 0;
        while (true) {
            int ansLeft = x - diff;

            if (!box.contains(ansLeft)) {
                ans = ansLeft;
                break;
            }

            int ansRight = x + diff;

            if (!box.contains(ansRight)) {
                ans = ansRight;
                break;
            }

            diff++;
        }

        System.out.println(ans);
    }
}