import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[][] c = new char[h][w];
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    cnt++;
                }
                c[i][j] = s.charAt(j);
            }
        }
        Set<Integer> hh = new HashSet<>();
        Set<Integer> ww = new HashSet<>();
        for (int i = 0; i < h; i++) {
            hh.add(i);
        }
        for (int i = 0; i < w; i++) {
            ww.add(i);
        }
        List<Set<Set<Integer>>> listh = new ArrayList<>();
        List<Set<Set<Integer>>> listw = new ArrayList<>();
        for (int i = 1; i <= h; i++) {
            listh.add(combination(hh, i));
        }
        for (int i = 1; i <= w; i++) {
            listw.add(combination(ww, i));
        }
        int ans = 0;
        for (int i = 0; i < listh.size(); i++) {
            Set<Set<Integer>> temph = listh.get(i);
            for (Set<Integer> s : temph) {
                for (int j = 0; j < listw.size(); j++) {
                    Set<Set<Integer>> tempw = listw.get(j);
                    for (Set<Integer> e : tempw) {
                        int tempCnt = 0;
                        for (int l = 0; l < h; l++) {
                            if (s.contains(l)) {
                                continue;
                            }
                            for (int m = 0; m < w; m++) {
                                if (e.contains(m)) {
                                    continue;
                                }
                                if (c[l][m] == '#') {
                                    tempCnt++;
                                }
                            }
                        }
                        if (tempCnt == k) {
                            ans++;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < listw.size(); j++) {
            Set<Set<Integer>> tempw = listw.get(j);
            for (Set<Integer> e : tempw) {
                int tempCnt = 0;
                for (int l = 0; l < h; l++) {
                    for (int m = 0; m < w; m++) {
                        if (e.contains(m)) {
                            continue;
                        }
                        if (c[l][m] == '#') {
                            tempCnt++;
                        }
                    }
                }
                if (tempCnt == k) {
                    ans++;
                }
            }
        }
        for (int i = 0; i < listh.size(); i++) {
            Set<Set<Integer>> temph = listh.get(i);
            for (Set<Integer> s : temph) {
                int tempCnt = 0;
                for (int l = 0; l < h; l++) {
                    if (s.contains(l)) {
                        continue;
                    }
                    for (int m = 0; m < w; m++) {
                        if (c[l][m] == '#') {
                            tempCnt++;
                        }
                    }
                }
                if (tempCnt == k) {
                    ans++;
                }
            }
        }
        int tempCnt = 0;
        for (int l = 0; l < h; l++) {
            for (int m = 0; m < w; m++) {
                if (c[l][m] == '#') {
                    tempCnt++;
                }
            }
        }
        if (tempCnt == k) {
            ans++;
        }
        System.out.println(ans);

    }

    private enum Operation {add, remove}

    private static <T> Set<T> apply(Set<T> src, Operation operation, T item) {
        Set<T> result = new HashSet<T>(src);
        if (Operation.add == operation) result.add(item);
        if (Operation.remove == operation) result.remove(item);
        return result;
    }

    private static <T> Set<Set<T>> _combination(Set<T> selected, int depth, Set<T> pool) {
        if (depth == 0) return apply(new HashSet<>(), Operation.add, selected);
        Set<Set<T>> result = new HashSet<Set<T>>();
        for (T item : pool) {
            result.addAll(
                    _combination(
                            apply(selected, Operation.add, item),
                            depth - 1,
                            apply(pool, Operation.remove, item)
                    )
            );
        }
        return result;
    }

    public static <T> Set<Set<T>> combination(Set<T> src, int k) {
        return _combination(new HashSet<T>(), k, src);
    }

}