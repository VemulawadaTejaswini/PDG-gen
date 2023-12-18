import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 && n == 0) break;
            boolean[][] dset = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    if (s.charAt(j) == '1')
                        dset[i][j] = true;
                    else dset[i][j] = false;
                }
            }
            System.out.println(solve(m, n, dset));
        }
    }

    public static int solve(int m, int n, boolean[][] dset) {
        List<boolean[]> list = makelist(m);
        int max=0;
        loop1:
        for (int i = 0; i < n; i++) {
            int ko;
            loop2:
            for (int a = 0; a < list.size(); a++) {
                boolean[] set = list.get(a);
                loop3:
                for (int j = 0; j < n; j++) {
                    if (i == j) continue;
                    loop4:
                    for (int k = 0; k < m; k++) {
                        if (!set[k]) continue;
                        if (dset[i][k] != dset[j][k]) continue loop3;
                    }
                    continue loop2;
                }
                ko = count(set);
                if(ko>max)max=ko+0;
                break;
            }
        }
        return max;
    }

    private static List<boolean[]> makelist(int m) {
        Map<Integer, boolean[]> map = new HashMap<>();
        Queue<boolean[]> que = new ArrayDeque<>();
        boolean[] a = new boolean[m];
        for (boolean b : a) b = false;
        que.add(a.clone());
        map.put(getkey(a), a.clone());
        while (!que.isEmpty()) {
            boolean[] b = que.remove();
            for (int i = 0; i < m; i++) {
                boolean[] c = b.clone();
                if (!c[i]) {
                    c[i] = true;
                    int key = getkey(c);
                    if (!map.containsKey(key)) {
                        que.add(c);
                        map.put(key, c);
                    }
                }
            }
        }
        List<boolean[]> list = new ArrayList<>(map.values());
        Collections.sort(list,
                new Comparator<boolean[]>() {
                    @Override
                    public int compare(boolean[] o1, boolean[] o2) {
                        return count(o1) - count(o2);
                    }
                }
        );
        return list;
    }

    private static int getkey(boolean[] a) {
        int key = 0, k = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) key += k;
            k *= 10;
        }
        return key;
    }

    private static int count(boolean[] be) {
        int count = 0;
        for (boolean b : be) {
            if (b) count++;
        }
        return count;
    }
}


