import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Long, Long> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(sc.next());
            map.merge(a, 1L, Long::sum);
        }
        List<Long> list2 = new ArrayList<>();
        List<Long> list4 = new ArrayList<>();
        for (Map.Entry<Long, Long> m : map.entrySet()) {
            if (m.getValue() >= 4) {
                list4.add(m.getKey());
            }
            if (m.getValue() >= 2) {
                list2.add(m.getKey());
                if (list2.size() == 2) {
                    break;
                }
            }
        }
        if (list4.size() != 0 && list4.get(0) >= list2.get(0)) {
            System.out.println(list4.get(0) * list4.get(0));
        } else if (list2.size() < 2) {
            System.out.println(0);
        } else {
            System.out.println(list2.get(0) * list2.get(1));
        }
    }
}