
/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> tm = new TreeMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (tm.containsKey(a)) {
                tm.get(a).add(b);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(b);
                tm.put(a, list);
            }

        }
        sc.close();

        int ans = 0;
        List<Integer> wages = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            if (tm.containsKey(i + 1)) {
                wages.addAll(tm.get(i + 1));
                Collections.sort(wages, Comparator.reverseOrder());
            }
            if (wages.size() > 0) {
                ans += wages.remove(0);
            }
        }
        System.out.println(ans);
    }
}
