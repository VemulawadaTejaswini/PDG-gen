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
            System.out.println(0);
            return;
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (!set.contains(a)) {
                set.add(a);
                list.add(a);
            } else {
                set2.add(a);
            }
        }
        Collections.sort(list);
        boolean isFirst = true;
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if (set2.contains(a)) {
                if (isFirst) {
                    isFirst = false;
                }
                continue;
            }
            if (isFirst) {
                ans++;
            }
            if (i == list.size() - 1) {
                ans++;
            } else {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) % a == 0) {
                        set2.add(list.get(j));
                    }
                }
                if (!isFirst) {
                    ans++;
                } else {
                    isFirst = false;
                }
            }
        }
        System.out.println(ans);
    }
}