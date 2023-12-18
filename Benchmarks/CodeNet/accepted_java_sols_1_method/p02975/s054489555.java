import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            Integer v = map.get(k);
            if (v == null) {
                v = 0;
            }
            map.put(k, ++v);
        }
        if (map.keySet().size() > 3) {
            System.out.println("No");
            return;
        }
        if (map.keySet().size() == 3) {
            if (n % 3 != 0) {
                System.out.println("No");
                return;
            }
            Integer[] array = map.keySet().toArray(new Integer[0]);
            Arrays.sort(array);
            int v = array[0] ^ array[1];
            if (v != array[2]) {
                System.out.println("No");
                return;
            }
            int limit = n / 3;
            if (map.get(array[0]).equals(map.get(array[1]))
                    && map.get(array[1]).equals(map.get(array[2]))
                    && map.get(array[0]) == limit
            ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        if (map.keySet().size() == 2) {
            if (n % 3 != 0) {
                System.out.println("No");
                return;
            }
            Integer[] array = map.keySet().toArray(new Integer[0]);
            Arrays.sort(array);
            if (array[0] != 0) {
                System.out.println("No");
                return;
            }
            int limit = n / 3;
            System.out.println(map.get(0) == limit ? "Yes" : "No");
        }
        if (map.keySet().size() == 1) {
            System.out.println(map.get(0) == null ? "No" : "Yes");
        }
    }
}