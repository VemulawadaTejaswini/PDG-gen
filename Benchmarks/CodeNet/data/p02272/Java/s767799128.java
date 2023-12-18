import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            List<Integer> ns = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (n != ns.size()) {
                return;
            }
            Integer cnt = 0;
            cnt = mergeSort(ns, 0, ns.size(), cnt);
            System.out.println(ns);
            System.out.println(cnt);
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
        }
    }

    private static Integer mergeSort(
            List<Integer> ns,
            int left,
            int right,
            Integer cnt
    ) {
        if ((left + 1) < right) {
            int mid = (left + right) / 2;
            cnt = mergeSort(ns, left, mid, cnt);
            cnt = mergeSort(ns, mid, right, cnt);
            cnt = merge(ns, left, mid, right, cnt);
        }
        return cnt;
    }

    private static Integer merge(
            List<Integer> ns,
            int left,
            int mid,
            int right,
            Integer cnt
    ) {
        int n1 = mid - left;
        int n2 = right - mid;
        List<Integer> ll = new ArrayList<>();
        List<Integer> rl = new ArrayList<>();
        IntStream.rangeClosed(0, n1 - 1).forEach(i -> {
            ll.add(ns.get(left + i));
        });
        IntStream.rangeClosed(0, n2 - 1).forEach(i -> {
            rl.add(ns.get(mid + i));
        });
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            cnt++;
            if (i < ll.size() && (j >= rl.size() ||
                    ll.get(i) <= rl.get(j))) {
                ns.set(k, ll.get(i));
                i++;
            } else {
                ns.set(k, rl.get(j));
                j++;
            }
        }
        return cnt;
    }
}


