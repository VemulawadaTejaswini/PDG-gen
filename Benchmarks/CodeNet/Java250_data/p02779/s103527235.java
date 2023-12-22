import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if (map.containsKey(temp)) {
                System.out.println("NO");
                return;
            } else {
                map.put(temp, 1);
            }
        }
        System.out.println("YES");
    }
}
