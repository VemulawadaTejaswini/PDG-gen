import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next()) + 1;
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < y; i++) {
            set.add(Integer.parseInt(sc.next()));
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < x; i++) {
            if (set.contains(i)) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }
        int first_half = 0;
        int last_half = 0;
        for (int i = 0; i < x; i++) {
            if (i <= z) {
                if (map.get(i)) first_half++;
            } else {
                if (map.get(i)) last_half++;
            }
        }
        System.out.println(Math.min(first_half, last_half));
    }
}
