import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Long.parseLong(sc.next()));
        }
        if (k >= n) {
            System.out.println(0);
            return;
        }
        Collections.sort(list);
        for (int i = 0; i < k; i++) {
            list.remove(list.size() - 1);
        }
        long sum = list.stream().mapToLong(l -> l.longValue()).sum();
        System.out.println(sum);
    }
}
