import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (!map.containsKey(x))map.put(x, 1);
            else map.put(x, map.get(x) + 1);
        }

        int remove = 0;
        for (Integer k: map.keySet()){
            if (map.get(k) < k) remove += map.get(k);
            else remove += (map.get(k) - k);
        }
        System.out.println(remove);
    }
}
