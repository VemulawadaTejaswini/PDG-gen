import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int x = 1; x <= n; x++) {
            map.put(x, scan.nextInt());
        }

        HashSet<Integer> loserHash = new HashSet<>();
        for (int y = 0; y < m; y++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (map.get(a).equals(map.get(b))) {
                loserHash.add(a);
                loserHash.add(b);
            } else if (map.get(a) > map.get(b)) {
                loserHash.add(b);
            } else {
                loserHash.add(a);
            }
        }

        System.out.println(n - loserHash.size());
    }
}