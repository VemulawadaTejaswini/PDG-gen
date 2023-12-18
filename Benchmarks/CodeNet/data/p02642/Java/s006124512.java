import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            max = Math.max(max, a);
            list.add(a);
            if (!set.contains(a)) {
                set.add(a);
            } else {
                set2.add(a);
            }
        }
        Collections.sort(list);
        for (int i = 2; i <= max; i++) {
            set3.add(i);
        }
        int ans = 0;
        for (int a : list) {
            if (!set2.contains(a) && set3.contains(a)) {
                ans++;
            }
            int idx = 1;
            while (a * idx <= max) {
                set3.remove(a * idx);
                idx++;
            }
        }
        System.out.println(ans);
    }
}